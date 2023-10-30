package String;

public class substringDemo {
    public static void main(String[] args) {
        String str = "www.tedu.com";
        String sub = str.substring(4,8);   //顾前不顾后，从第4个下标到第7个下标
        System.out.println(sub);

        String sub1 = str.substring(4);
        System.out.println(sub1);       //tedu.com

        String sub2 = str.substring(0,3);
        System.out.println(sub2);   //www

        String sub3 = str.substring(9,12);
        System.out.println(sub3);  //com

        String sub4 = str.substring(4,8);
        System.out.println(sub4);       //tedu

        String sub5 = str.substring(1,3);
        System.out.println(sub5);       //ww

    }
}

