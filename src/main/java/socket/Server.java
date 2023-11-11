package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * 运行在服务端的java.net.ServerSocket
     * 它的主要工作:
     * 1:向操作系统申请服务端口
     * 2:监听服务端口,等待客户端的连接
     *
     * 如果我们把Socket比喻为电话插座,那么ServerSocket相当于是"总机"
     */
    private ServerSocket serverSocket;

//    private List<PrintWriter> allOut = new ArrayList<>();

    private Map<String ,PrintWriter> allOut = new HashMap<>();
    //构造器用来初始化服务端
    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
                ServerSocket实例化时要指定对外的服务端口,客户端创建Socket时就是通过这个端口
                与服务端建立连接的.
                注意,该端口不能与服务器计算机其他运行的程序申请的端口一致,否则会抛出端口被占用
                的异常:java.net.BindException:address already in use
                如果出现需要更换端口,或者将占用该端口的程序结束.
             */
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //start方法用来让服务端开始工作
    public void start(){
        try {
            while(true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了");
                //启动一个线程来处理与该客户端的交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     *  该线程任务负责与指定客户端进行交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//记录客户端的IP地址
        private String nickName;//记录该客户端的昵称
        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机IP地址信息
            host = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw = null;
            try {
                /*
                    Socket的重要方法:
                    InputStream getInputStream()
                    通过Socket获取的字节输入流可以读取对方发送过来的字节数据
                 */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                //单独读取来自客户端发送过来的第一行字符串，这个是昵称
                nickName = br.readLine();

                //创建输出流
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);
                //将输出流存入共享集合allOut中
                synchronized (allOut){

                    allOut.put(nickName, pw);

                }

                sendMessage(nickName+"("+host+")上线了！当前人数："+allOut.size());

                String line;
                /*
                    当调用缓冲输入流的readLin方法读取对方发送过来一行字符串的操作时,可能由于
                    对方的断开方法不同,导致不同的效果:
                    如果对方是异常断开(没有进行4次挥手):此时readLine方法会抛出异常:java.net.SocketException: Connection reset
                    如果对方正常断开(进行了4次挥手):此时readLine方法会返回null
                    该方法也存在阻塞现象
                    当我们调用readLine方法读取对方发送过来一行字符串时,该方法会进入阻塞等待,直到
                    对方确实发送了一行数据过来才会解除阻塞并将这一行字符串立即返回
                 */
                while ((line = br.readLine()) != null) {
                    /*
                    客户端发送的消息会有两种形式
                    群发：直接发送
                    私聊：@对方昵称：聊天内容
                     */
                    if(line.startsWith("@")){
                        sendMessageToSB(line, pw);
                    }
                    else {
                        sendMessage(nickName + "(" + host + ")说:" + line);
                    }
                }
            } catch (IOException e) {
                System.out.println(nickName+"("+host+")异常断开了");
            }finally {
                //处理当前客户端断开连接后的操作
                //将客户端的输出流从共享集合allOut中删除
                synchronized (allOut){
//                    allOut.remove(pw);
                    allOut.remove(nickName);
                }

                //广播该客户端下线了
                sendMessage(nickName+"("+host+")下线了！当前在线人数"+allOut.size());
                //关闭socket
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        private void sendMessage(String message){

            //现将消息在服务端控制台上打桩输出
            System.out.println(message);
            synchronized (allOut) {
//                for (PrintWriter o : allOut) {
//                    o.println(message);
//                }
                //遍历map中所有的value（所有客户端都输出流）
                Collection<PrintWriter> c = allOut.values();
                for (PrintWriter o: c) {
                    o.println(message);
                }
            }
        }

        private void sendMessageToSB(String message,PrintWriter pw){
            //message的格式：@对方昵称：聊天内容
            //1：截取出昵称（从message第二个字符开始截取到“：”）
            String toNickName = message.substring(1,message.indexOf(":"));
            //截取聊天信息（从message截取到结尾）
            String toMessage = message.substring(message.indexOf(":")+1);
            if(allOut.containsKey(toNickName)){
                pw = allOut.get(toNickName);
                pw.println(nickName+"悄悄对你说"+toMessage);   //xx对你说：聊天信息
            }
            else {
                pw.println("[系统提示]："+toNickName+"，不存在");
            }
        }
    }
}


