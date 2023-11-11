package reflect;

import java.util.Scanner;

/*
反射机制实例化对象
Class提供了一个方法
Object newInstance()
可以使用其表示的类公开无参构造器实例化对象

 */

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //实例化Person
        Person p =new Person();
        System.out.println(p);

        //反射机制实例化
        //1加载类对象
//        Class cls = Class.forName("reflect.Person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名：");
        String className =scanner.nextLine();
        Class cls =Class.forName(className);

        Object o = cls.newInstance();
        System.out.println(o);

    }
}
