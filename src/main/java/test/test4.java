package test;

import java.io.File;

/**
 * 将test目录删除
 * 由于目录必须是空目录才可以删除
 * 1:先获取test目录中的所有子项,遍历将他们全部删除
 * 2:再将test目录删除
 */
public class test4 {
    public static void main(String[] args) {
        File dir = new File("mkDir");
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles();
            System.out.println("一共有" + subs.length + "个子项");
            for (File sub : subs) {
                sub.delete();
            }
        }
        dir.delete();
        System.out.println("删除成功");
    }
}


