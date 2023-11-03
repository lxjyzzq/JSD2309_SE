package homework.day1103.socket1;

import socket.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Server {
    private ServerSocket serverSocket;
    private Map<String, PrintWriter> allOut = new HashMap<>();

    public Server(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(7777);
            System.out.println("服务启动完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        try {
            while (true){
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了");
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;
        private String nickName;
        public ClientHandler(Socket socket){
            this.socket = socket;
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
                pw = new PrintWriter(bw, true);
                synchronized (allOut){
                    allOut.put(nickName,pw);
                }
                sendMessage(nickName+"("+host+")上线了,当前在线人数："+allOut.size());
                String line;
                while ((line = br.readLine())!= null){
                    if(line.equalsIgnoreCase("@")){
                        sendMessageToSB(line,pw);
                    }else {
                        sendMessage(nickName+"("+host+")说："+line);
                    }
                }
            } catch (IOException e) {
                System.out.println(nickName+"("+host+")异常断开了");
            }finally {
                synchronized (allOut){
                    allOut.remove(nickName);
                }
                sendMessage(nickName+"("+host+")下线了,当前人数"+allOut.size());
            }
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        private void sendMessageToSB(String message, PrintWriter pw){
            String toNickName = message.substring(1,message.indexOf(":"));
            String toMessage = message.substring(message.indexOf(":")+1);
            if(allOut.containsKey(toNickName)){
                pw = allOut.get(toNickName);
                pw.println(nickName+"悄悄说:"+toMessage);
            }else {
                pw.println("系统提示："+nickName+"不存在");
            }
        }

        private void sendMessage(String message){
            System.out.println(message);
            synchronized (allOut){
                Collection<PrintWriter> c = allOut.values();
                for (PrintWriter o:
                     c) {
                    o.println(message);
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
