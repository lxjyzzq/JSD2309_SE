package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(7,6));
        list.add(new Point(68,34));
        list.add(new Point(12,79));
        list.add(new Point(53,10));
        list.add(new Point(35,45));
        list.add(new Point(3,9));
        System.out.println(list);
        /*
            编译不通过
            原因:Collections认为该集合元素不可比较,因此无法排序.
            sort方法要求集合元素必须实现接口:Comparable.(compare:比较)

            要求:在使用Collections.sort(List list)进行排序的前提是,集合元素
            必须实现Comparable接口,而对于我们定义的类作为集合元素时,该操作是不建议的
            因为这样的操作对我们的代码产生了侵入性.

            侵入性:当我们调用某个API功能时.其要求我们修改额外代码.
            侵入性不利于项目的维护,所以实际开发中要尽量避免

         */
//        Collections.sort(list);//编译不通过

//        MyComparator com = new MyComparator();
//        Collections.sort(list, com);

        //匿名内部类形式创建比较规则
//        Comparator<Point> com = new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                int olen1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int olen2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//                return olen1-olen2;
//            }
//        };
//        Collections.sort(list,com);


        Collections.sort(list,new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int olen1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int olen2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return olen1-olen2;
            }
        });


        System.out.println(list);



    }
}


