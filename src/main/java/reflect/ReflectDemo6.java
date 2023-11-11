package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Method对象表示一个方法，其提供了一组可以获取表示的方法中的相关信息
 */
public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class cls = Class.forName("reflect.Person");
        //获取本类指定名字的方法
//        Method method = cls.getDeclaredMethod("sayHello");//sayHello()
//        Method method = cls.getDeclaredMethod("hehe");//hehe()
        /*
            获取有参方法时，getDeclaredMethod的第一个参数为方法名，从第二个参数开始为获取方法的参数列表
         */
        Method method = cls.getDeclaredMethod("say",String.class,int.class);//say(String,int)
        String name = method.getName();//获取方法名
        int count = method.getParameterCount();//获取当前方法的参数个数
        System.out.println("方法名:"+name);
        System.out.println("参数个数:"+count);
        int modifiers = method.getModifiers();//获取当前方法的访问修饰符
        switch (modifiers){
            case Modifier.PUBLIC:
                System.out.println("是一个公开方法");
                break;
            case Modifier.PRIVATE:
                System.out.println("是一个私有方法");
                break;
            case Modifier.PROTECTED:
                System.out.println("是一个受保护方法");
                break;
        }

    }
}

