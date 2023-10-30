package homework.day1030.socket1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;
    public Client(){

        try {
            System.out.println("正在连接服务端.......");
            socket = new Socket("localhost",8088);
            System.out.println("服务端已连接......");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){

        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            String nickName;
            while (true){
                System.out.println("请输入您的昵称");
                nickName = scanner.nextLine();
            if((nickName.trim()).length()>0){
                pw.println(nickName);
                break;
            }
            else {
                System.out.println("请输入昵称");
            }
            }
            System.out.println("欢迎您："+nickName+"，开始聊天吧");
            while (true){
                String line = scanner.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}




