package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

public class Test6 {
    public static void main(String[] args) throws Exception {
        String packName = Test6.class.getPackage().getName();//确定包名
        //定位Test6.class文件所在的目录
        File dir = new File(
                Test6.class.getResource(".").toURI()
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
                        System.out.println("调用方法:"+method.getName()+"()");
                        method.invoke(obj);
                    }
                }
            }
        }

    }
}
