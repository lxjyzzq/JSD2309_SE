package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p = new Person("张三",25);
        System.out.println(p);

        //加载类对象
        Class cls = Class.forName("reflect.Person");

        //2.通过类对象获取特定的构造器
        /*
        Constructor类  构造器对象
        Constructor类也是反射对象之一，他的每一个实例表示一个构造器
         */
        Constructor constructor = cls.getConstructor(String.class,int.class);
        Object obj = constructor.newInstance("王五",45);
        System.out.println(obj);

        //使用无参构造器，等效与Class中的newInstace().但是如果构造器抛出特定异常此方式可对应抛出该异常
        Constructor constructor1 = cls.getConstructor();
        Object obj1 = constructor1.newInstance();
        System.out.println(obj1);

    }
}
