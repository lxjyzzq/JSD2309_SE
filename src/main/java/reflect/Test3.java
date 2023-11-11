package reflect;

import java.io.File;
import java.net.URISyntaxException;

/**
 * 获取当前类Test3所在包中所有的字节码文件
 */
public class Test3 {
    public static void main(String[] args) throws URISyntaxException {
        File dir = new File(
            Test3.class.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            System.out.println(sub.getName());
        }
    }
}
