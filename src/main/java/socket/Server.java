package socket;

import javafx.print.Printer;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private ServerSocket serverSocket;
    //构造器用来初始化服务器


    private List<PrintWriter> allOut = new ArrayList<>();


    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
                ServerSocket实例化时要指定服务端口,该端口不能与操作系统其他软件
                开启的端口冲突,否则会抛出异常:java.net.BindException:address already in use
                此时需要更换端口再次尝试.
             */
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            System.out.println("等待连接......");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了");


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
