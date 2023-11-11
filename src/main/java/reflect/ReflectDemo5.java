package reflect;

import java.lang.reflect.Method;

/**
 * 获取本类定义的所有方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("reflect.Person");
        //获取本类自己定义的方法，不含从超类继承的方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
}

