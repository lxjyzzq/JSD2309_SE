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

        //第五遍
        double d = 123.123;
        String s2 = String.valueOf(d);
        System.out.println("s2:"+s2);


        //第四遍
        String s3 = a+"";
        System.out.println("s3:"+s3);


        //第三遍
        int a1 = 123;
        String q1 = String.valueOf(a1);
        System.out.println("q1"+ a1);

        //第二遍
        double d1 = 123.123;
        String q2 = String.valueOf(d1);
        System.out.println("q2:"+q2);

        //第一遍
        String q3 = a+"";
        System.out.println(q3);

    }
}
