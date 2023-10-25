package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class test2 {

    //实现简易记事本
    //程序启动后对note.txt文件进行写操作
    //如果用户在控制台上单独输入了“exit”则程序结束

    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream("note.txt"); //换行
        FileOutputStream fos = new FileOutputStream("note.txt",true);   //不换行
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        while(!line.contentEquals("exit")){
            fos.write(line.getBytes(StandardCharsets.UTF_8));
            line = scan.nextLine();
        }
        fos.close();
    }
}

