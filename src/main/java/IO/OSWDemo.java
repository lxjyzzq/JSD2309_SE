package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 字符流:java.io.Readr和java.io.Writer
 * Reader是所有字符输入流的超类
 * Writer是所有字符输出流的超类
 * 字符流的特点:以字符为单位读写数据
 * 字符流都是高级流,并且除了转换流以外,其余的字符流都只能连接在其他字符流上
 *
 * 转换流
 * java.io.InputStreamReader和OutputStreamWriter
 * 由于其他的高级字符流都只能连接在字符流上,而低级流是字节流,这导致他们无法在流连接中
 * 连接在一起,因此需要一个"转换器"负责将字符流与字节流衔接起来,这就是转换流.
 * 转换流是唯一可以连接在字节流上的字符流.负责的工作就是将字符与字节相互转换,从而让字符
 * 流与字节流连接在一起进行方便的文本数据读写操作
 */


public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        /*
        转换流创建时通常要指定第二个参数来明确字符集，这样通过转换写出的文本都会使用指定的字符转换为对应字节在写出
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);

        osw.write("你好啊，你好啊，你好你好你好啊");
        osw.write("啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦");

        System.out.println("完成");
        osw.close();

    }
}


