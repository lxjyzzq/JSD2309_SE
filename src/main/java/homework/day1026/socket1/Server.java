package homework.day1026.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server(){
        try {
            System.out.println("启动服务器......");
            serverSocket = new ServerSocket(5866);
            System.out.println("服务器启动完毕");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            System.out.println("等待客户连接......");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户连接了");

            InputStream in = socket.getInputStream();
            int d = in.read();
            System.out.println(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

}

