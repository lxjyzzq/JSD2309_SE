package file;


import java.io.File;
import java.io.IOException;

/**
 * create:创建
 * file:文件
 * 创建一个空白文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目目录下新建一个名为test.txt的文件
        File file = new File("test.txt");
        /*
            boolean exists()
            判断当前File表示的文件或目录是否真实存在,若存在则返回true

            boolean createNewFile()
            当且仅当该文件成功创建则返回true
         */
//        boolean success = file.createNewFile();
        if(file.exists()) {
            System.out.println("该文件已存在");
        }else{
            file.createNewFile();
            System.out.println("文件创建完毕");
        }
    }
}
