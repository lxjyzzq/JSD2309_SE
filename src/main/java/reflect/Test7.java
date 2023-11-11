package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

/**
 * 调用与当前类Test7所在同一个包中被注解@AutoRunClass标注的类中那些被@AutoRumMethod标注的方法
 * 若干次(次数由该方法上注解@AutoRunMethod的参数决定)
 */
public class Test7 {
    public static void main(String[] args) throws Exception {
        String packName = Test7.class.getPackage().getName();//确定包名
        File dir = new File(
                Test7.class.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String className = sub.getName().replace(".class","");
            Class cls = Class.forName(packName+"."+className);
            //判断该类是否被注解@AutoRunClass标注
            if(cls.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("实例化:"+className);
                Object obj = cls.newInstance();
                //获取该类中所有的方法
                Method[] methods = cls.getDeclaredMethods();
                for(Method method : methods){
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                        AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                        int value = arm.value();
                        System.out.println("调用方法:"+method.getName()+"()"+value+"次:");
                        for(int i=0;i<value;i++) {
                            method.invoke(obj);
                        }
                    }
                }
            }
        }
    }
}
