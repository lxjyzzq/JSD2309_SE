package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 获取一个类中的所有公开方法
 * Class类提供了对应的方法:
 * Method[] getMethods()
 *
 * Method类是反射对象之一，它的每一个实例用于表示一个方法
 * 通过Method对象我们可以得知该方法的相关信息(方法名，参数列表，返回值，访问修饰符等)
 * 还可以通过Method对象调用该方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
//        Class cls = Class.forName("java.lang.String");
        /*
            java.util.ArrayList
            java.util.HashMap
            java.io.FileInputStream
            reflect.Person
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        Method[] methods = cls.getMethods();//通过类对象获取其表示类中所有公开方法
        System.out.println("一共:"+methods.length+"个方法");
        for(Method method : methods){
            System.out.println(method.getName());//输出方法名
        }
    }
}

