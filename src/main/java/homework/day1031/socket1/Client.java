package homework.day1031.socket1;

import javafx.beans.binding.When;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器......");
            socket = new Socket("127.0.0.1",8808);
            System.out.println("服务端已连接.....");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scan = new Scanner(System.in);
            String nickName;
            while (true){
                System.out.println("请输入你的昵称：");
                nickName = scan.nextLine();
                if(nickName.trim().length()>0){
                    pw.println(nickName);
                    break;
                }else {
                    System.out.println("昵称至少输入一个字");
                }
            }
            System.out.println("欢迎您【"+nickName+"】，开始聊天吧");

            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();

            while (true){
                String line = scan.nextLine();
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    private class ServerHandler implements  Runnable{
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String message;
                while ((message = br.readLine())!= null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
