package IO;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("demo.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("demo_cp.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        int d ;
        while ((d = bis.read()) != -1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,耗时:"+(end-start)+"ms");
        bis.close();
        bos.close();
        System.out.println("0000000000000000000000000000");

        //第五遍
        FileInputStream fis5 = new FileInputStream("demo.txt");
        BufferedInputStream bis5 = new BufferedInputStream(fis5);
        FileOutputStream fos5 = new FileOutputStream("democp5.txt");
        BufferedOutputStream bos5 = new BufferedOutputStream(fos5);
        while ((d = bis5.read()) != -1){
            bos5.write(d);
        }
        bis5.close();
        bos5.close();
        System.out.println("5555555555555555555555555555555555555555");


        //第四遍
        FileInputStream fis4 = new FileInputStream("demo.txt");
        BufferedInputStream bis4 = new BufferedInputStream(fis4);
        FileOutputStream fos4 = new FileOutputStream("democp4.txt");
        BufferedOutputStream bos4 = new BufferedOutputStream(fos4);
        while ((d = bis4.read()) != -1){
            bos4.write(d);
        }
        bis4.close();
        bos4.close();
        System.out.println("4444444444444444444444444444444444444");


        //第三遍
        FileInputStream fis3 = new FileInputStream("demo.txt");
        BufferedInputStream bis3 = new BufferedInputStream(fis3);
        FileOutputStream fos3 = new FileOutputStream("democp3.txt");
        BufferedOutputStream bos3 = new BufferedOutputStream(fos3);
        while ((d = bis3.read()) != -1){
            bos3.write(d);
        }
        bis3.close();
        bos3.close();
        System.out.println("333333333333333333333333333333");


        //第二遍
        FileInputStream fis2 = new FileInputStream("demo.txt");
        BufferedInputStream bis2 = new BufferedInputStream(fis2);
        FileOutputStream fos2 = new FileOutputStream("democp2.txt");
        BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
        while ((d = bis2.read()) != -1){
            bos2.write(d);
        }
        bis2.close();
        bos2.close();
        System.out.println("222222222222222222222222222222");


        //第一遍
        FileInputStream fis1 = new FileInputStream("demo.txt");
        BufferedInputStream bis1 = new BufferedInputStream(fis1);
        FileOutputStream fos1 = new FileOutputStream("democp1.txt");
        BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
        while ((d = bis1.read())!= -1){
            bos1.write(d);
        }
        bos1.close();
        bis1.close();









    }
}
