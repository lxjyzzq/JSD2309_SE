package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 调用Person类所有本类定义的公开且无参的方法
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();//实例化一个Person

        //通过类对象获取Person中的所有方法
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if(
                method.getParameterCount()==0
                            &&
                method.getModifiers()== Modifier.PUBLIC
            ){
                System.out.println("调用方法:"+method.getName()+"()");
                method.invoke(obj);
            }
        }
    }
}
