package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 内部维护一个默认8192长的char数组，总是以块读文本数据来保证读取效率
 *
 * 缓冲字符输入流支持按行读取字符串操作
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源代码输出到控制台上
        FileInputStream fis = new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        /*
            String readLine()
            读取一行字符串，返回的字符串中不含有最后的换行符
            特殊情况:
            当读取到空行(这一行只有换行符，以当前文件为例，比如第二行就是空行)，则返回一个空字符串
            当读取到了流的末尾，返回null

            实际操作:
            当我们第一次调用readLine()方法时，缓冲输入流的首要操作是以块读形式一次性
            从文件中读取8192(默认长度为8192)个字符并存入其内部的char数组。
            然后从数组开头连续扫描字符，直到遇见换行符位置，将换行符之前的内容组成一个
            字符串并将其返回。
            当我们第二次调用readLine方法时，缓冲输入流继续从char数组刚才换行符位置继续
            向后扫描直到遇见第二个换行符位置，然后将扫描的字符组成一个字符串返回
            以此类推。

         */
//        String line = br.readLine();
//        System.out.println(line);

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
