package homework.day1030.socket1;

import socket.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import static java.lang.System.*;

public class Server {
    private ServerSocket serverSocket;

    public Server(){

        try {
            out.println("正在启动服务端......");
            serverSocket = new ServerSocket(8088);
            out.println("服务端启动完成......");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void start(){

        try {
            while (true) {
                out.println("等待客户端连接.....");
                Socket socket = serverSocket.accept();
                out.println("一个客户端连接了");
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;
        private String nickName;

        public ClientHandler(Socket socket){
            this.socket = socket;
        }

        public void run(){

            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                nickName = br.readLine();
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(nickName + "(" + host + ")说:" + line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
