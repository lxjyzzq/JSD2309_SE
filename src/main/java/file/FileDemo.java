package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");

        String name = file.getName();
        System.out.println(name);

        long length = file.length();
        System.out.println(length+"个字节");

        /*
            boolean canRead()
            判断是否可读
            boolean canWrite()
            判断是否可写
         */
        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        System.out.println("可读:"+cr);
        System.out.println("可写:"+cw);

        boolean hidden = file.isHidden();
        System.out.println("是否隐藏:"+hidden);



    }
}
