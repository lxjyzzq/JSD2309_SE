package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(
//            try的()中定义并初始化需要在finally中调用close的对象
                //只有实现了AutoCloseable接口的类才可以在try()中定义并初始化
                //且编译器编译代码后会将其在finally'中调用close关闭
                //java中所有的流都实现了该接口
                FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

