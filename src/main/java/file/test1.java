package file;

import java.io.File;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i < 101; i++) {
            File file = new File("test"+i+".txt");
            file.createNewFile();
        }
    }
}
