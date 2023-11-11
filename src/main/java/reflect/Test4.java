package reflect;

import java.io.File;
import java.net.URISyntaxException;

/**
 * 实例化与当前Test4所在同一个包中的所有类
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
//        Class cls = Class.forName("包名.类名");
        //包名如何确定?因为都与Test4在同一个包中，因此通过Test4的类对象即可得知
        String packName = Test4.class.getPackage().getName();
        //如何确定每个类名?java要求类名与对应的字节码文件名一致，通过每个字节码文件确定类名
        //1获取Test4所在包中所有的字节码文件(等同于获取到了所有类)
        File dir = new File(Test4.class.getResource(".").toURI());
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        //2通过每个字节码文件来确定类名
        for(File sub : subs){
            String className = sub.getName().replace(".class","");//Test4
            //加载类对象
            Class cls = Class.forName(packName+"."+className);//reflect.Test4
            System.out.println("实例化:"+className);
            Object obj = cls.newInstance();
            System.out.println(obj);
        }

    }
}
