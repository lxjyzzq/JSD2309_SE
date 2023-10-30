package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前项目目录下的test.txt删除
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("删除完毕");
        }else{
            System.out.println("文件不存在");
        }
    }
}
