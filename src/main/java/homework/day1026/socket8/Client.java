package homework.day1026.socket8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务端.....");
            socket = new Socket("127.0.0.1", 8088);
            System.out.println("连接服务端成功......");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            out.write(8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
