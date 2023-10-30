package homework.day1026.socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    private Socket socket;
    public Client(){

        try {
            System.out.println("正在连接服务端........");
            socket = new Socket("127.0.0.1",5867);
            System.out.println("服务端已连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){

        try {
            OutputStream out = socket.getOutputStream();
            out.write(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }


}
