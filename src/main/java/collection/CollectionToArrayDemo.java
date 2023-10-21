package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

//        String[] array = c.toArray(new String[c.size()]);
//        String[] array = c.toArray(new String[10]);
        String[] array = c.toArray(new String[1]);
        System.out.println(Arrays.toString(array));

        //第五遍
//        String[] array5 = c.toArray(new String[c.size()]);
//        String[] array5 = c.toArray(new String[10]);
        String[] array5 = c.toArray(new String[1]);
        System.out.println(Arrays.toString(array5));

        //第四遍
//        String[] array4 = c.toArray(new String[c.size()]);
//        String[] array4 = c.toArray(new String[10]);
        String[] array4 = c.toArray(new String[1]);
        System.out.println(Arrays.toString(array4));

        //第三遍
//        String[] array3 = c.toArray(new String[c.size()]);
//        String[] array3 = c.toArray(new String[10]);
        String[] array3 = c.toArray(new String[1]);
        System.out.println(Arrays.toString(array3));


        //第二遍
//        String[] array2 = c.toArray(new String[c.size()]);
//        String[] array2 = c.toArray(new String[10]);
        String[] array2 = c.toArray(new String[1]);
        System.out.println(Arrays.toString(array2));

        //第一遍
//        String[] array1 = c.toArray(new String[c.size()]);
//        String[] array1 = c.toArray(new String[10]);
        String[] array1 = c.toArray(new String[1]);
        System.out.println(Arrays.toString(array1));


    }
}
