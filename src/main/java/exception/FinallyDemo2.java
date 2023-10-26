package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo2 {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("z:/fos.dat");
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("aaaaaa");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
//                System.out.println("bbbb");
            }
        }
    }
}
