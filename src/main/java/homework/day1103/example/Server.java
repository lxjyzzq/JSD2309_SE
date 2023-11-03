package homework.day1103.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 聊天室服务端
 */
public class Server {
    private ServerSocket serverSocket;
    private Map<String,PrintWriter> allOut = new HashMap<>();

    public Server(){
        try {
            System.out.println("正在启动服务端...");
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
                System.out.println("wait to connnect...");
                Socket socket = serverSocket.accept();
                System.out.println("one client connected");
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
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                nickName = br.readLine();

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);
                synchronized (allOut) {
                    allOut.put(nickName,pw);
                }
                sendMessage(nickName + "(" + host + ")上线了!当前在线人数:"+allOut.size());


                String line;
                while ((line = br.readLine()) != null) {
                    if(line.startsWith("@")){
                        sendMessageToSomeone(line,pw);
                    }else {
                        sendMessage(nickName + "(" + host + ")说:" + line);
                    }
                }
            } catch (IOException e) {
                System.out.println(nickName + "(" + host + ")异常断开了");
            } finally {
                synchronized (allOut) {
                    allOut.remove(nickName);
                }
                sendMessage(nickName + "(" + host + ")下线了!当前在线人数:"+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void sendMessageToSomeone(String message,PrintWriter pw){
            String toNickName = message.substring(1,message.indexOf(":"));
            String toMessage = message.substring(message.indexOf(":")+1);
            if(allOut.containsKey(toNickName)){
                pw = allOut.get(toNickName);
                pw.println(nickName+"悄悄对你说:"+toMessage);//范传奇悄悄对你说:聊天信息
            }else{
                pw.println("[系统提示]:"+toNickName+",不存在");//[系统提示]:王克晶,不存在
            }
        }

        private void sendMessage(String message){
            System.out.println(message);
            synchronized (allOut) {
                Collection<PrintWriter> c = allOut.values();
                for(PrintWriter o : c){
                    o.println(message);
                }
            }
        }

    }

}