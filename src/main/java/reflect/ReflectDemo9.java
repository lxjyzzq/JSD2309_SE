package reflect;

import java.lang.reflect.Method;

/**
 * 暴力反射
 * 反射机制访问类的私有成员
 */
public class ReflectDemo9 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
//        p.hehe();//类的外部不可以调用类的私有成员
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getDeclaredMethod("hehe");//获取hehe方法
        method.setAccessible(true);//强行打开访问权限
        method.invoke(obj);//obj.hehe();
        method.setAccessible(false);//好习惯:使用后关闭私有成员的访问权限

    }
}
