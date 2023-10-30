package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWdemo2 {
    public static void main(String[] args) throws FileNotFoundException {

         /*
            文件输出流(字节流，低级流)
            作用:向文件中写入字节数据
         */
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        /*
            转换输出流(字符流，高级流)
            作用:在流连接中起到"转换器"的作用，类比HDMI转VGA
            1:衔接字节流与字符流
            2:将写出的字符转换为字节
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        /*
            缓冲字符输出流(字符流，高级流)
            作用:内部维护一个默认8192长的char数组，将写出的字符缓存，以块写形式保证写出效率
         */
        BufferedWriter bw = new BufferedWriter(osw);
        /*
            PrintWriter(字符流，高级流)
            作用:按行写出字符串
                自动行刷新(后续介绍)
         */
        PrintWriter pw = new PrintWriter(bw);

        pw.println("你好");
        pw.println("再见");
        System.out.println("写出完毕!");
        pw.close();//close()中会自动flush一次



        //第一遍
















    }
}
