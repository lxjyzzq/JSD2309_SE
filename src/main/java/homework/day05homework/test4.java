package homework.day05homework;

import java.io.File;
import java.util.Scanner;

/**
 * 改错练习:
 * 程序启动后要求用户输入一个关键字，然后列出当前项目下所有
 * 名字中包含该关键字的子项
 * 单词记一记:
 * key  计算机中为"关键"的含义，不译为钥匙
 * dir  是单词directory的缩写，目录的意思
 * list 列表
 * @author Xiloer
 *
 */

public class test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入关键字:");
        String key = s.nextLine();
        File dir = new File(".");
        if(dir.isDirectory()) {
            File files[] = dir.listFiles();
            for(int i=0;i<files.length;i++) {
                String fileName = files[i].getName();
                if(fileName.contains(key)) {
                    System.out.println(fileName);
                }
            }
        }
    }
}

