package homework.day04homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 *
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 *
 * @author Xiloer
 *
 */
public class test2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        while(true){
            String fileName = scanner.nextLine();
            File file = new File(fileName);

            if(file.exists()){
                System.out.println("该文件已存在，请更换名字");
            }else{
                file.createNewFile();
                System.out.println("文件创建完毕!");
                break;
            }

        }
    }
}
