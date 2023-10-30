package String;

/**
 * String是不变对象，即：对象创建后内容不可改变，改变会创建新对象
 */

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";//相同字面量会重用对象
        System.out.println(s1==s2);//true 地址相同

        String s3 = "123abc";//仍然重用对象
        System.out.println(s1==s3);

        //不建议new的形式创建字符串,因为不会重用对象
        String s4 = new String("123abc");
        System.out.println(s1==s4);
        System.out.println("----------------------");

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        s1 = s1 + "!";//字符串是不变对象,修改内容会创建新对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);//s1由于引用了新对象,所以与s2保存的地址不同了

        /*
        当编译器编译代码时发现一个表达式两侧是字面变量时就会进行计算，这是编译器的预计算特性
        因此下面的代码会被编译器直接计算，并替换该计算的表达式
        自己吗文件中下面代码为
        String s5 = "123abc";
        因此虚拟机执行时会采用常量池中的对象进行重用
         */

        String s5 = "123" + "abc";
        System.out.println("s5"+s5);
        System.out.println(s2==s5);

        String s = "123";
        String s6 = s + "abc";   //产生新对象
        System.out.println(s2==s6);
        System.out.println("*************");

        String q1 = "123abc";
        String q2 = "123abc";
        System.out.println(q1==q2);

        String q3 = "123abc";
        System.out.println(q1==q3);

        String q4 = new String("123abc");
        System.out.println(q1==q4);

        String q5 = "123"+"abc";
        System.out.println(q2==q5);

        String q = "123";
        String q6 = q + "abc";
        System.out.println(q2 == q6);



    }
}


