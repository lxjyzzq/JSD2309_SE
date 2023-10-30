package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    private Socket socket;

    public Client(){
        try {
            System.out.println("在联");
            socket = new Socket("172.18.12.157",8088);
//            socket = new Socket("127.0.0.1",8088);
            System.out.println("已连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void start(){
        try {
            /*
                Socket提供的方法:
                OutputStream getOutputStream()
                通过socket获取的输出流写出的字节可以发送给远端连接的计算机
             */
            OutputStream out =  socket.getOutputStream();
            out.write(1);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Client client = new Client();
        client.start();


    }
}
