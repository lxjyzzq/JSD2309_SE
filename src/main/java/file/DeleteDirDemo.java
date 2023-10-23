package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前项目目录下的demo目录删除
        File dir = new File("./demo");
        /*
            delete方法在删除目录时要求必须是一个空目录才可以删除
         */
//        File dir = new File("./a");
        if(dir.exists()){
            dir.delete();
            System.out.println("目录已删除");
        }else{
            System.out.println("目录不存在");
        }
    }
}
