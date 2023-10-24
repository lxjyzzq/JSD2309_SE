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
        delFile5(dir);
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

    //第五遍
    public static void delFile5(File file){
        if(file.isDirectory()){
            File[] subs = file.listFiles();
            for (File sub:
                 subs) {
                delFile5(sub);
            }
        }
        file.delete();
    }

    //第四遍
    public static void delFile4(File file){
        if(file.isDirectory()){
            File[] subs = file.listFiles();
            for (File sub:
                 subs) {
                delFile4(sub);
            }
            file.delete();
        }
        file.delete();
    }

    //第三遍
    public static void delFile3(File file) {
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for (File sub :
                    subs) {
                delFile3(sub);
            }
            file.delete();
        }
        file.delete();
    }


    //第二遍
    public static void delFile2(File file){
        if(file.isDirectory()){
            File[] subs = file.listFiles();
            for (File sub : subs) {
                delFile2(sub);
            }
            file.delete();
        }
        file.delete();
    }





    //第一遍
    public static void delFile1(File file){
        if(file.isDirectory()){
            File[] subs = file.listFiles();
            for (File sub: subs ) {
                delFile(sub);
            }
            file.delete();
        }
        file.delete();
    }
}

