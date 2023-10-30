package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        for (int i = 0; i < list.size()/2; i++) {
            String a = list.get(i);
            a = list.set(list.size()-1-i, a);
            list.set(i, a);

//            list.set(i, list.set(list.size()-1-i, list.get(i)));

        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
