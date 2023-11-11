package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * 获取注解参数
 */
public class ReflectDemo14 {
    public static void main(String[] args) throws Exception {
        //获取Person类中sayHello方法上的注解@AutoRunMethod中的参数值
        Class cls = Class.forName("reflect.Person");
        //获取sayHello方法
        Method method = cls.getDeclaredMethod("sayHello");
        //判断该方法上是否含有注解@AutoRunMethod
        if(method.isAnnotationPresent(AutoRunMethod.class)){
            AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
            int value = arm.value();//获取@AutoRunMethod注解参数"value"的值
            System.out.println(value);//输出sayHello方法上@AutoRunMethod注解中的参数值
        }

    }
}
