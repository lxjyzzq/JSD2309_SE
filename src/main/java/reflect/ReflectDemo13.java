package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * 访问方法上的注解
 */
public class ReflectDemo13 {
    public static void main(String[] args) throws Exception {
        //查看Person类上的方法sayHello有没有被注解@AutoRunMethod标注?
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getDeclaredMethod("sayHello");
        boolean mark = method.isAnnotationPresent(AutoRunMethod.class);
        if(mark){
            System.out.println("被标注了");
        }else{
            System.out.println("没有被标注");
        }
    }
}
