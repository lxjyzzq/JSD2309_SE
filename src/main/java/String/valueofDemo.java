package String;

/**
 * String提供了一组重载的静态方法:valueOf
 * 作用是将其他类型转换为String
 */
public class valueofDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);
        System.out.println("s1:"+s1);

        double d = 123.123;
        String s2 = String.valueOf(d);
        System.out.println("s2:"+s2);

        String s3 = a+"";//任何内容和字符串链接结果都是字符串
        System.out.println("s3:"+s3);





    }
}
