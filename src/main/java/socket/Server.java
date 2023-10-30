package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

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
                    //传奇(192.168.2.125)说:XXXXXXXXXXXXXX
                    System.out.println(nickName + "(" + host + ")说:" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
