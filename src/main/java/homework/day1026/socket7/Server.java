package homework.day1026.socket7;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(){
        try {
            System.out.println("正在启动服务端....");
            serverSocket = new ServerSocket(5872);
            System.out.println("启动服务端成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        try {
            System.out.println("正在等待连接.....");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户连接成功.......");
            InputStream in = socket.getInputStream();
            int d = in.read();
            System.out.println(d);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
