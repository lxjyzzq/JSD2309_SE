package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        String[] arry = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < arry.length; i++) {
            String e = arry[i];
            System.out.println(e);
        }
        System.out.println("-----------------------------------");

        for (String e : arry) {
            System.out.println(e);
        }

        //第五遍
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        for (String e: arry
             ) {
            System.out.println(e);
        }

        //第四遍
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        for (String e: arry
             ) {
            System.out.println(e);
        }

        //第三遍
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        for (String e:arry
             ) {
            System.out.println(e);
        }

        //第一遍
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        for (String e: arry) {
            System.out.println(e);
        }


        Collection c = new ArrayList<>();
        c.add("一");
        c.add("二");
        c.add("三");
        c.add("四");
        c.add("五");

        Iterator<String> it = c.iterator();
        while ((it.hasNext())){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("***********************");

        for(Object o:c){
            String e = (String)o;
            System.out.println(e);
        }

        //第五遍
        while ((it.hasNext())){
            String e = it.next();
            System.out.println(e);
        }

        for(Object o:c){
            String e = (String)o;
            System.out.println(e);
        }

        //第四遍
        while ((it.hasNext())){
            String e = it.next();
            System.out.println(e);
        }

        for(Object o:c){
            String e = (String)o;
            System.out.println(e);
        }

        //第三遍
        while ((it.hasNext())){
            String e = it.next();
            System.out.println(e);
        }

        for(Object o:c){
            String e = (String)o;
            System.out.println(e);
        }

        //第二遍
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        for (Object o:c
             ) {
            String e = (String) o;
            System.out.println(e);
        }
        System.out.println("++++++++++++++++++++++++++++++");

        //第一遍
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        for (Object o:c
             ) {
            String e = (String) o;
            System.out.println(e);
        }

    }
}
