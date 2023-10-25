package IO;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
缓冲输出流写缓冲问题
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "今天天气还不错，噜啦啦噜啦啦噜啦噜啦啦啦";

        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);

        /*
            flush:英文原意:冲水
            缓冲流的flush()方法
            当调用flush方法后,会将缓冲区中已经缓存的所有数据一次性写出.

            使用场景:当我们写出的数据不足以装满缓冲流的缓冲区(8kb数组),但是这些数据希望
            立刻写出时,可以调用flush()将已经缓存的数据进行一次性写出.

            实际上flush方法定义在java.io.Flushable接口上的.
            而输出流的超类:java.io.OutputStream实现了该接口,这意味着java中所有的
            字节输出流都具有flush方法.
            除了缓冲流之外,其余的高级流中flush方法的默认实现就是调用它连接的流的flush方法
            目的是将flush动作传递下去,最终传递给缓冲流的flush做实际的清空缓冲区操作

         */
//        bos.flush();


        bos.close();




    }
}
