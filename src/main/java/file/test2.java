package file;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            File file = new File("test"+i+".txt");
            file.delete();
        }

    }
}
