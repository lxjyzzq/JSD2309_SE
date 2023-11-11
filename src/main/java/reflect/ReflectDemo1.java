package reflect;

import java.util.Scanner;

/*
JAVA反射机制
反射是JAVA的动态机制，允许程序在“运行期间”再确定对象实例化，方法调用，属性操作等
反射可以提高代码的灵活度和可拓展性，但运行效率较慢，开销较大，避免过度使用
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        类对象：class类的实例
        JVM加载一个类的字节码文件同时会实例化一个class的实例来加载记录类的信息
        那么这个class的实例就可以反射出加载类的相关信息
        从而在程序运行期间供我们了解一个类的内容以便进行操作

        在jvm内部，每个被加载的类有且只有一个class实例

        反射的第一步是获取一个类的类对象（class实例）

        获取方式一：
        类名.class
        例如：
        Class c1 = String.class;  //获取String的类对象
        Class c2 = int.class;   //获取int的的类对象

        获取方式二：
        Class.froName(String className)
        通过指定一个类完全限定名来获取一个类的类对象
        例如：
        Class c1 =Class.forName("java.lang.string")
        Class c2 =Class.forName("java.until.ArrayList")

        获取String的类对象
        Class cls =String.class;
        Class cls =ArrayList.class;

        Class cls =Class.forName("java.until.ArrayList");

         */
        System.out.println("请输入一个类名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Class cls = Class.forName(name);

        String className = cls.getName();
        System.out.println("完全限定名为："+className);

        className = cls.getSimpleName();//表示类的类名，不包含包名
        System.out.println("类名："+className);

        Package pack =cls.getPackage();
        String packName = pack.getName();
        System.out.println("包名："+packName);


    }
}


