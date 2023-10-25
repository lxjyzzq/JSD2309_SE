package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedReader和BufferedWriter
 * 缓冲字符流内部维护一个char数组，默认长度8192.也是将读写数据以块读写形式保证效率
 *
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流(内部总是链接着BufferedWriter作为缓冲保证写效率)
 * PrintWriter的特点:
 * 可以按行写出字符串
 * 可以自动行刷新
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("你好你好啊");
        pw.println("噜啦啦噜啦啦");
        pw.println("66666666666666");
        System.out.println("写出完毕");
        pw.close();

    }
}
