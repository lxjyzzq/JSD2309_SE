package collection;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array"+ Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);
        /*
            asList返回值为ArrayList,但是它不是java.util.ArrayList
            而是Arrays的内部类,并且该集合内部直接引用的就是给定的数组
            所以对该集合的任何操作就是对原数组的操作
         */
        list.set(1,"six");
        System.out.println("list"+list);
        System.out.println("array"+ Arrays.toString(array));

        list.add("seven");
        /*
            由于数组是定长的,因此集合会改变元素个数的操作对于数组都是不支持的操作
            会抛出异常:java.lang.UnsupportedOperationException
                               不支持       操作     异常
         */
//        list.add("seven");

        //创建新集合并包含该集合所有元素,新集合则可以任意操作
//        List<String> list1 = new ArrayList<>();
//        list1.addAll(list);
        /*
            java中所有的集合都支持一个参数为Collection的构造器,目的是在创建该集合
            的同时包含给定集合的所有元素
         */
        //创建list1时包含list集合中的所有元素
        List<String> list1 = new ArrayList<>(list);
        System.out.println("list1:"+list1);
        list1.add("seven");
        System.out.println("list1:"+list1);



        //第一遍
        List<String> list01 = Arrays.asList(array);
        System.out.println("list:"+list);

    }
}

