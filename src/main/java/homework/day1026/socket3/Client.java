package homework.day1026.socket3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    private Socket socket;

    public Client(){
        try {
            System.out.println("正在连接服务端.....");
            socket = new Socket("127.0.0.1",5868);
            System.out.println("连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){

        try {
            OutputStream out = socket.getOutputStream();
            out.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
