package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载的listFiles方法,允许我们传入一个文件过滤器FileFilter
 * 该方法会将目录中所有满足过滤要求的子项返回,不满足的则被忽略
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        /**
         * 获取当前目录中名字里含有字母"e"的所有子项
         */

        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter fileFilter = new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.getName().contains("e");
                }
            };
            File[] subs = dir.listFiles(fileFilter);
            for (File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}

