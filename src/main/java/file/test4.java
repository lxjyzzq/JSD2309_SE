
package file;

import java.io.File;

public class test4 {
    public static void main(String[] args) {
        /*
         * 获取当前目录中名字以"."开头的所有子项
         */
        File dir = new File(".");
        File[] subs = dir.listFiles(f->f.getName().startsWith("."));
        for (File sub : subs){
            System.out.println(sub.getName());
        }
    }
}