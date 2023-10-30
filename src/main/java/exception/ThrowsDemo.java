package exception;

import java.awt.*;
import java.io.IOException;

public class ThrowsDemo {

//    public void doSome()throws IOException, AWTException {}

    //允许子类方法抛出部分异常
//    public void doSome()throws IOException{}

    //允许子类方法不再抛出任何异常
//    public void doSome(){}

    //允许子类方法抛出超类方法声明抛出异常的子类型异常
//    public void doSome()throws FileNotFoundException {}

    //不允许子类方法抛出额外异常(超类方法没有声名抛出的且不存在继承关系的异常)
//    public void doSome()throws SQLException {}

    //不允许子类方法抛出超类方法声明异常的超类型异常
//    public void doSome()throws Exception{}

}

