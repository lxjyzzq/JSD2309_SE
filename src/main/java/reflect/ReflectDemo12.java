package reflect;

import reflect.annotations.AutoRunClass;

/**
 * 反射机制访问注解
 */
public class ReflectDemo12 {
    public static void main(String[] args) throws Exception {
        /*
            判断Person类有没有被注解@AutoRunClass标注?
         */
        Class cls = Class.forName("reflect.Person");
        /*
            所有的反射对象都支持该方法:
            boolean isAnnotationPresent(Class cls)
            用于判断当前反射对象表示的内容是否被指定注解标注
         */
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if(mark){
            System.out.println("被标注了");
        }else{
            System.out.println("没有被标注");
        }
    }
}
