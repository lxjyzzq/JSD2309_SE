package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合存放引用类型元素,因此集合中每个元素实际上保存的是地址
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<Point> c = new ArrayList<>();
        Point p = new Point(1,2);
        c.add(p);//将p的值存入集合(p是引用类型变量,保存的值是Point对象的地址)
        System.out.println("p:"+p);//(1,2)
        System.out.println("c:"+c);//[(1,2)]
        p.setX(2);
        System.out.println("p:"+p);//(2,2)
        System.out.println("c:"+c);//[(2,2)]

        test(p,c);
        System.out.println("p:"+p);//(?,?)
        System.out.println("c:"+c);//[?]
    }

    public static void test(Point p,Collection<Point> c){
        p.setX(5);
        p = new Point(6,7);
        c.add(p);
        c = new ArrayList<>();
        c.add(new Point(4,5));
    }
}


