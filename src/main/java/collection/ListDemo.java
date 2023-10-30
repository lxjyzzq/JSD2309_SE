package collection;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        String e = list.get(2);
        System.out.println(e);

        for (int i = 0; i < list.size(); i++) {
            e = list.get(i);
            System.out.println(e);
        }

        String old = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是："+old);

        //第五遍
        String e5 = list.get(2);
        System.out.println(e5);

        for (int i = 0; i < list.size(); i++) {
            e5 = list.get(i);
            System.out.println(e5);
        }

        String old5 = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是："+old5);

        //第四遍
        String e4 = list.get(2);
        System.out.println(e4);

        for (int i = 0; i < list.size(); i++) {
            e4 = list.get(i);
            System.out.println(e4);
        }

        String old4 = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是："+old4);


        //第三遍
        String e3 = list.get(2);
        System.out.println(e3);

        for (int i = 0; i < list.size(); i++) {
            e3 = list.get(i);
            System.out.println(e3);
        }

        String old3 = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是："+old3);


        //第二遍
        String e2 = list.get(2);
        System.out.println(e2);

        for (int i = 0; i < list.size(); i++) {
            e2 = list.get(i);
            System.out.println(e2);
        }

        String old2 = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是："+old2);

        //第一遍
        String e1 = list.get(2);
        System.out.println(e1);

        for (int i = 0; i < list.size(); i++) {
            e = list.get(i);
            System.out.println(e1);
        }

        String old1 = list.set(2,"six");
        System.out.println(list);
        System.out.println("被替换的元素是："+old1);



    }
}

