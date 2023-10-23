package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前项目目录中的所有子项
        File dir = new File(".");
        /*
            boolean isFile()
            单且仅当当前File对象表示的是一个[真实存在]的[文件]时,方法返回true

            boolean isDirectory()
            当前File对象表示的是一个真实存在的目录时,方法返回true
         */
        if(dir.isDirectory()){
            /*
                File[] listFiles()
                获取一个目录中的所有子项,每一个子项使用一个File对象表示,最终以数组的
                形式返回所有子项
             */
            File[] subs = dir.listFiles();
            System.out.println("一共有"+subs.length+"个子项");
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}

