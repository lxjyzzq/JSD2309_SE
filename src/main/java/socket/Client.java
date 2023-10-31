package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
        java.net.Socket 套接字
        Socket封装了TCP协议的通讯细节,使用它可以与服务端建立连接,并基于两条流的IO操作与服务端
        进行数据的可靠传输.
     */
    private Socket socket;
    //构造方法用于初始化客户端
    public Client(){
        try {
            System.out.println("正在连接服务端...");
            /*
                实例化Socket的过程就是与服务端建立连接的过程
                参数1:服务端计算机的IP地址,如果连接本机可以使用"localhost"
                参数2:服务端程序打开的端口
                如果连接失败会抛出异常
             */
//            socket = new Socket("127.0.0.1",8088);
            socket = new Socket("172.18.12.153",8088);
            System.out.println("服务端已连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //start方法用于让客户端开始工作
    public void start(){
        try {
            /*
                Socket提供的一个重要方法:
                OutputStream getOutputStream()
                通过Socket获取一个字节输出流,使用该输出流写出的字节数据都会发送给服务端
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);




            Scanner scanner = new Scanner(System.in);

            //首先要求用户输入昵称，并将其发送给服务端
            String nickName;
            while(true) {
                System.out.println("请输入您的昵称:");
                nickName = scanner.nextLine();
                //要求昵称至少输入一个字
                if(nickName.trim().length()>0){
                    pw.println(nickName);//将昵称发送给服务端
                    break;
                }else{
                    System.out.println("昵称至少输入一个文字");
                }
            }

            System.out.println("欢迎你["+nickName+"],开始聊天吧!");
            while(true) {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String line = scanner.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
                line = br.readLine();   //读取服务端发送回来的一行字符串
                System.out.println(line);   //输出到客户端控制台上
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                /*
                    当准备断开连接时要调用socket的close方法.内部会进行与对方的四次挥手操作
                 */
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}

