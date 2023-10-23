
package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        //在当前项目目录下新建一个名为demo的空目录
//        File dir = new File("./demo");
        //相对路径中"./"忽略时,默认就是从当前目录开始
//        File dir = new File("demo");

        File dir = new File("a"+File.separator+"b");
        if(dir.exists()){
            System.out.println("目录已存在");
        }else{
            /*
                make:做
                directory:目录
                mkdir是linux里的一条命令,用于创建一个目录

                mkdir():创建目录时要求其所在的目录必须存在,否则创建失败
                mkdirs():创建目录时会连同所有不存在的父目录一起创建出来(推荐该方法)
             */
//            dir.mkdir();
            dir.mkdirs();
            System.out.println("目录已创建!");
        }
    }
}

