package reflect;

import java.lang.reflect.Constructor;

/**
 * 利用反射机制使用Student(String name,int age,char gender)实例化对象
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Student");
        Constructor c = cls.getConstructor(String.class,int.class,char.class);
        Object obj = c.newInstance("李四",22,'女');
        System.out.println(obj);
    }
}
