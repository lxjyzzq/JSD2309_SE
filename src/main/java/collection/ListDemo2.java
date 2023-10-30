package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        list.add(2,"six");
        System.out.println(list);

        String  old = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是：" + old);

        //第五遍
        list.add(2,"six");
        System.out.println(list);

        String  old5 = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是：" + old5);

        //第四遍
        list.add(2,"six");
        System.out.println(list);

        String  old4 = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是：" + old4);

        //第三遍
        list.add(2,"six");
        System.out.println(list);

        String  old3 = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是：" + old3);



        //第二遍
        list.add(2,"six");
        System.out.println(list);

        String  old2 = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是：" + old2);

        //第一遍
        list.add(2,"six");
        System.out.println(list);

        String  old1 = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是：" + old1);

    }
}

