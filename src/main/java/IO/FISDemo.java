package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        /*
            文件输出流常用的构造器:
            FileInputStream(String fileName)
            FileInputStream(File file)
            如果指定的文件不存在则会抛出异常:FileNotFoundException
         */
//        File file = new File("./fos.dat");
//        FileInputStream fis = new FileInputStream(file);

        FileInputStream fis = new FileInputStream("./demo.txt");

        int d = fis.read();
        System.out.println(d);
        d = fis.read();
        System.out.println(d);
        d = fis.read();
        System.out.println(d);






    }
}
