package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向当前项目下的demo.txt文件中写入字节数据
        FileOutputStream fos = new FileOutputStream("demo.txt");
        fos.write(1);
        fos.write(2);
        fos.write(2);
        fos.close();

    }
}

