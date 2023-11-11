package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 调用与当前类Test5所在同一个包中那些类里所有的无参且公开的放啊
 */
public class Test5 {
    public static void main(String[] args)throws Exception {
        String packName = Test5.class.getPackage().getName();
        File dir = new File(Test5.class.getResource(".").toURI());
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String className = sub.getName().replace(".class","");
            Class cls = Class.forName(packName+"."+className);
            System.out.println("实例化:"+className);
            Object obj = cls.newInstance();
            //获取该类所有方法
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                if(method.getParameterCount()==0
                            &&
                   method.getModifiers()== Modifier.PUBLIC
                ){
                    System.out.println("调用方法:"+method.getName()+"()");
                    method.invoke(obj);
                }
            }
        }

    }
}
