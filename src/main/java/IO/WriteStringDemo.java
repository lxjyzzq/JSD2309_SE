package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");

        String line = "我不想写了";

        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        line = "aaaaaaaaaaaaaaaa";
        data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        fos.close();

    }
}

