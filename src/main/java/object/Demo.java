package object;

public class Demo {
    public static void main(String[] args) {

        Point p = new Point(1,2);
                /*
            println()方法内部会调用给定对象Point的toString方法将其转换为一个字符串
            然后将该字符串输出到控制台

            Object类中定义了toString方法,默认的实现转换的字符串内容格式:类名@地址
            实际开法中我们经常输出一个对象到控制台查看对象保存的信息,而如果不重写该方法
            仅输出地址信息对我们没有帮助,此时就需要重写这个方法
         */

        System.out.println(p);

        String line = "这个对象的内容是："+p;
        System.out.println(line);

        Point p1 = new Point(1,2);
        System.out.println(p == p1);

        System.out.println(p.equals(p1));

    }
}


