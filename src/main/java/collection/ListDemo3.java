package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

        //获取list集合中的2-7这部分元素
        List<Integer> subList = list.subList(2,8);
        System.out.println(list);

        //将子集元素扩大10倍
        for(int i = 0;i<subList.size();i++){
            int n = subList.get(i);
            n = n *10;
            subList.set(i,n);
        }
        System.out.println("子集"+subList);

        //将list集合1-8删除
        list.subList(1,9).clear();
        System.out.println(list);

        //第五遍
        List<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list5.add(i);
        }
        List<Integer> subList5 = list5.subList(2,8);
        System.out.println(list5);

        for(int i = 0;i<subList5.size();i++){
            int n = subList5.get(i);
            n = n *10;
            subList5.set(i,n);
        }
        System.out.println("子集"+subList5);

        list5.subList(1,9).clear();
        System.out.println(list5);


        //第四遍
        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list4.add(i);
        }
        List<Integer> subList4 = list4.subList(2,8);
        System.out.println(list4);

        for(int i = 0;i<subList4.size();i++){
            int n = subList4.get(i);
            n = n *10;
            subList4.set(i,n);
        }
        System.out.println("子集"+subList4);

        list4.subList(1,9).clear();
        System.out.println(list4);


        //第三遍
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list3.add(i);
        }
        List<Integer> subList3 = list3.subList(2,8);
        System.out.println(list3);

        for(int i = 0;i<subList3.size();i++){
            int n = subList3.get(i);
            n = n *10;
            subList3.set(i,n);
        }
        System.out.println("子集"+subList3);

        list3.subList(1,9).clear();
        System.out.println(list3);

        //第二遍
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list2.add(i);
        }
        List<Integer> subList2 = list2.subList(2,8);
        System.out.println(list2);

        for(int i = 0;i<subList2.size();i++){
            int n = subList2.get(i);
            n = n *10;
            subList2.set(i,n);
        }
        System.out.println("子集"+subList2);

        list2.subList(1,9).clear();
        System.out.println(list2);

        //第一遍
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list1.add(i);
        }
        List<Integer> subList1 = list1.subList(2,8);
        System.out.println(list1);

        for(int i = 0;i<subList1.size();i++){
            int n = subList1.get(i);
            n = n *10;
            subList1.set(i,n);
        }
        System.out.println("子集"+subList1);

        list1.subList(1,9).clear();
        System.out.println(list1);


    }
}

