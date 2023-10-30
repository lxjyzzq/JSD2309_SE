package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 转换输入流的流连接操作，以及基础的读取字符操作
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        /*
              字符流也有:read()方法。但是该方法有别于字节流的read()
              字符流是读取一个字符回来，实际返回的是char，一个char占2字节。因此以int型返回时
              2进制为低16位有效
              00000000 00000000 10101010 01010101
              前面补充16个0
              相同之处，如果int值返回为-1，也是用于表达流读取到了末尾
         */
//        int d = isr.read();//字符流的read方法可以读取一个字符
//        System.out.println((char)d);
        int d;
        while((d = isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();

        //第一遍
        FileInputStream fis1 = new FileInputStream("osw.txt");
        InputStreamReader isr1 = new InputStreamReader(fis1, StandardCharsets.UTF_8);

        while ((d = isr1.read()) != -1){
            System.out.println((char)d);
        }
        isr1.close();


    }
}
