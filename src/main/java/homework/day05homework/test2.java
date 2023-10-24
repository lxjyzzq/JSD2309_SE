package homework.day05homework;

import java.io.File;

/**
 * 列出当前目录中所有名字包含s的子项。
 *
 * 使用匿名内部类和lambda两种写法
 *
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 *
 * @author Xiloer
 *
 */

public class test2 {
    public static void main(String[] args) {
        File dir = new File("s");
        File[] subs = dir.listFiles(f->f.getName().contains("s"));
        for (File sub : subs){
            System.out.println(sub.getName());
        }

    }
}

