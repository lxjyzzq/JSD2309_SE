package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.mp4");
        FileOutputStream fos = new FileOutputStream("b.mp4");
        long start = System.currentTimeMillis();
        int d ;
        while ((d = fis.read()) != -1){
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        long time = end - start ;
        System.out.println(time);
        fis.close();
        fos.close();

    }
}

