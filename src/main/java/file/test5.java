package file;

import java.io.File;

/**
 * 将demo目录删除
 * 由于目录必须是空目录才可以删除
 * 1:先获取test目录中的所有子项,遍历将他们全部删除
 * 2:再将test目录删除
 */

public class test5 {
    public static void main(String[] args) {
        File dir = new File("demo");
        delFile(dir);
        System.out.println("删除成功");
    }

    public static void delFile(File file){
        if(file.isDirectory()){
            File[] subs = file.listFiles();
            for (File sub: subs) {
                delFile(sub);
            }
            file.delete();
        }
        file.delete();
    }
}

