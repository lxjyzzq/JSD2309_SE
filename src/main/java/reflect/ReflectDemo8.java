package reflect;

import java.lang.reflect.Method;

/**
 * 有参方法的调用
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getDeclaredMethod("say",String.class);//say(String)
        method.invoke(obj,"hello!");//obj.say("hello!")

        Method method1 = cls.getDeclaredMethod("say",String.class,int.class);
        method1.invoke(obj,"大家好",5);
    }
}

