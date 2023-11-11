package reflect;

import java.io.File;
import java.net.URISyntaxException;

/**
 * 通过类对象获取类加载路径和当前类路径
 */
public class ReflectDemo11 {
    public static void main(String[] args) throws URISyntaxException {
        /*
            获取类加载路径
            JVM加载类的字节码文件的起始目录
            判定:
            当前类的字节码文件所在包的顶级包的上一级目录

            对于maven项目而言，应该对应的就是target/classes目录

            将来通过类加载路径可以访问到当前项目中的所有信息
         */
        File baseDir = new File(
           ReflectDemo11.class.getClassLoader().getResource(".").toURI()
        );
        System.out.println(baseDir);

        /*
            当前类路径，指的是当前类的字节码文件所在的目录
         */
        File dir = new File(
           ReflectDemo11.class.getResource(".").toURI()
        );
        System.out.println(dir);
    }
}
