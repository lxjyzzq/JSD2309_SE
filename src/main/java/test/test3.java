package test;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个名为myDir的目录,并在该目录中创建100个文件,文件名:test1.txt-test100.txt
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        File newdir = new File("mkDir");
        if(newdir.exists()){
            System.out.println("已存在");
        }
        else {
            newdir.mkdirs();
        }
        for (int i = 1; i < 101; i++) {
            File a = new File(newdir,"test"+i+".txt");
            if(a.exists()){
                System.out.println("文件已存在");
            }else {
                a.createNewFile();
            }
        }
        System.out.println("创建成功");

    }
}

