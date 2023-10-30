package homework.day05homework;

import java.io.*;

/**
 * 改正下面程序的错误
 *
 * 程序实现的功能需求:复制一个文件
 * @author Xiloer
 *
 */

public class test1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("test.txt");
        FileOutputStream fos = new FileOutputStream("test_cp.txt");

        int d;
        byte[] data = new byte[1024*10];
        while((d = fis.read(data))!=-1){
            fos.write(data,0, d);
        }
    }
}
