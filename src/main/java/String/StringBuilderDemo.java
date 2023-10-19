package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String line = "好好学习java";
        StringBuilder builder = new StringBuilder(line);
        builder.append(",为了找个好工作");

        System.out.println(builder);
        System.out.println(line);
        /*
        StringBuilder不是String，没有继承关系！
         //通过调用toString方法将StringBuilder内容以字符串形式返回.
         */
        line = builder.toString();
        System.out.println(line);

        builder.replace(9,16,"还好吧");
        System.out.println(builder);
        builder.delete(0,2);
        System.out.println(builder);
        System.out.println(builder);
        builder.insert(0,"活着");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        System.out.println("+++++++++++++++++++++++++++++++");

        //第五遍
        String line5 = "好嗨哟";
        StringBuilder builder5 = new StringBuilder(line5);
        builder5.append("感觉人生到达了高潮");
        System.out.println(builder5);
        line5 = builder5.toString();
        System.out.println(line5);
        builder5.replace(0,2,"哈哈哈");
        System.out.println(builder5);
        builder5.delete(0,2);
        System.out.println(builder5);
        builder5.insert(0,"活着");
        builder5.reverse();
        System.out.println(builder5);
        System.out.println("-------------------------------");

        //第四遍
        String line4 = "qqqq";
        StringBuilder builder4 = new StringBuilder(line4);
        builder4.append("你好啊");
        System.out.println(builder4);
        line4 = builder4.toString();
        System.out.println(line4);
        builder4.replace(0,5,"好嗨呦");
        System.out.println(builder4);
        builder4.delete(0,2);
        System.out.println(builder4);
        builder4.insert(0,"你坏");
        System.out.println(builder4);
        builder4.reverse();
        System.out.println(builder4);
        System.out.println("********************************");


        //第三遍
        String line3 = "pppp";
        StringBuilder builder3 = new StringBuilder(line3);
        builder3.append("oooo");
        System.out.println(builder3);
        line3 = builder3.toString();
        System.out.println(line3);
        builder3.replace(0,5,"啊啊啊");
        System.out.println(builder3);
        builder3.delete(0,2);
        System.out.println(builder3);
        builder3.insert(0,"你哭");
        System.out.println(builder3);
        builder3.reverse();
        System.out.println(builder3);
        System.out.println("+++++++++++++++++++++++++++++");

        //第二遍
        String line2 = "abc";
        StringBuilder builder2 = new StringBuilder(line2);
        builder2.append("def");
        System.out.println(builder2);
        line2 = builder2.toString();
        System.out.println(line2);
        builder2.replace(0,2,"英语");
        System.out.println(builder2);
        builder2.delete(0,2);
        System.out.println(builder2);
        builder2.insert(0,"你好");
        System.out.println(builder2);
        builder2.reverse();
        System.out.println(builder2);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        //第一遍
        String line1 = "你好啊";
        StringBuilder builder1 = new StringBuilder(line1);
        builder1.append(",我不好");
        System.out.println(builder1);
        System.out.println(line1);
        line1 = builder1.toString();
        System.out.println(line1);
        builder1.replace(0,3,"哈哈哈");
        System.out.println(builder1);
        builder1.delete(0,2);
        System.out.println(builder1);
        builder.insert(0,3);
        System.out.println(builder1);
        builder1.reverse();
        System.out.println(builder1);


    }
}

