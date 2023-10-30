package homework.day1026.socket5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    private Socket socket;

    public Client(){
        try {
            System.out.println("正在连接服务端");
            socket = new Socket("127.0.0.1", 5870);
            System.out.println("连接成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            out.write(5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
