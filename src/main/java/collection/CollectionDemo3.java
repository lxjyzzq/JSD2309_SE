package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {

    public static void main(String[] args) {
        Collection c1 = new ArrayList<>();
        c1.add("java");
        c1.add(".net");
        c1.add("c++");
        System.out.println("c1"+c1);

        Collection c2 = new ArrayList<>();
        c2.add("ios");
        c2.add("android");
        c2.add("java");
        System.out.println("c2"+c2);

        c2.addAll(c1);
        System.out.println("c1:"+c1);
        System.out.println("c2"+c2);

        Collection c3 = new ArrayList<>();
        c3.add("c++");
        c3.add("ios");
        System.out.println("c3"+c3);

        boolean contains = c1.containsAll(c3);
        System.out.println("c1是否包含c3的所有元素"+contains);




    }
}



