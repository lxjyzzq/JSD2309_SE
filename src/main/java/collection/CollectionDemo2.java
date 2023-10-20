package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));

        System.out.println(c);

        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素,如果包含则返回true
            集合判断是否包含给定元素是依据该元素是否与集合现有元素存在equals比较为true
            的情况
         */
        Point p = new Point(1,2);
        boolean contains = c.contains(p);
        System.out.println("是否包含:"+contains);

        /*
            remove方法也是删除与集合中equals比较为true的元素
            对于List这类可以存放重复元素的集合而言,如果删除的是重复元素则仅删除靠前的
            第一个equals比较为true的元素.
         */
        c.remove(p);
        System.out.println(c);
        System.out.println("是否包含:"+c.contains(p));



    }
}



