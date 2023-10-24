package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
将所有小写字母写入demo.txt文件中
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        for (int i = 0; i < 26; i++) {
            fos.write(97+i);
        }
        fos.close();
    }
}
