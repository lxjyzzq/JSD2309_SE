package reflect;

import java.lang.reflect.Field;

/**
 * 反射机制操作属性
 */
public class ReflectDemo10 {
    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
        t.name = "王克晶";
        System.out.println(t);

        Class cls = Class.forName("reflect.Teacher");
        Object obj = cls.newInstance();
        Field field = cls.getDeclaredField("name");
        field.set(obj,"范传奇");//obj.name="范传奇"
        System.out.println(obj);
    }
}






