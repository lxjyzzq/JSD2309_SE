package file;

import java.io.File;

public class test5 {
    public static void main(String[] args) {
        /**
         * 获取当前目录中名字里含有字母"e"的所有子项
         */

        File dir = new File(".");
//        File[] subs = dir.listFiles(f->f.getName().indexOf("e")!=-1);
        /*
            String提供的方法:
            boolean contains(String s)
            判断当前字符串中是否包含给定字符串,若包含则返回true
         */
        File[] subs = dir.listFiles(f->f.getName().contains("e"));
        for (File sub : subs){
            System.out.println(sub.getName());
        }
    }
}

