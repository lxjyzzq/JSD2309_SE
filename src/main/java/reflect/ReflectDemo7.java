package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射机制调用方法
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.doSome();

//        //实例化
//        Class cls = Class.forName("reflect.Person");
//        Object obj = cls.newInstance();
//        //调用方法
//        Method method = cls.getDeclaredMethod("doSome");//获取无参方法:doSome
//        method.invoke(obj);//obj.doSome();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        System.out.println("请输入方法名:");
        String methodName = scanner.nextLine();

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        //调用方法
        Method method = cls.getDeclaredMethod(methodName);//获取无参方法:doSome
        method.invoke(obj);//obj.doSome();

    }
}

