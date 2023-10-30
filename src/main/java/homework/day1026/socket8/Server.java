package homework.day1026.socket8;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(){
        try {
            System.out.println("正在启动服务端.......");
            serverSocket = new ServerSocket(5888);
            System.out.println("服务端启动成功......");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        try {
            System.out.println("等待客户端连接......");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了");
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
