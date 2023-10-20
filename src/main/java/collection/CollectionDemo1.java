package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合
 * java.util.Collection接口
 * 集合与数组功能类似,可以保存一组元素.并且对元素的维护操作都封装成了方法,使用便捷.
 * 集合提供了多种不同的数据结构
 *
 * Collection下面有两个常见的子接口:
 * java.util.List:线性表,可以存放重复元素且有序的集合
 * java.util.Set:不可以存放重复元素,大部分实现类是无序的集合
 * 这里元素是否重复取决于元素equals比较的结果
 */

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        集合仅能存放引用类型元素
         */

        Collection c = new ArrayList();
        /*
        boolean add(E e)
         */

        c.add(123);  //实际上自动装箱变成包装类，才能存放基本类型值
//        c.add(Integer.valueOf(123));  //实际上自动装箱变成包装类，才能存放基本类型值
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        System.out.println(c);


        /*
            int size()
            返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:"+size);
        /*
            boolean isEmpty()
            判断当前集合是否为空集(size==0)
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);
        //清空集合
        c.clear();
        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("是否为空集:"+c.isEmpty());

        //第五遍
        System.out.println("6555555555555555555555555555555");
        Collection c5 = new ArrayList();
        c5.add("a");
        c5.add("b");
        c5.add("c");
        c5.add("d");
        c5.add("e");
        System.out.println("是空集："+c5.isEmpty());
        System.out.println("size" + c5.size());
        c5.clear();
        System.out.println("是空集"+c5.isEmpty());
        System.out.println("size"+c5.size());


        //第四遍
        System.out.println("4444444444444444444444444444444");
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.add(2);
        c4.add(3);
        c4.add(4);
        System.out.println("是否为空集"+c4.isEmpty());
        System.out.println("size"+c4.size());
        c4.clear();
        System.out.println("是否为空集"+c4.isEmpty());
        System.out.println("size"+c4.size());

        //第三遍
        System.out.println("3333333333333333333333333333");
        Collection c3 = new ArrayList();
        c3.add("0");
        c3.add("1");
        c3.add("2");
        c3.add("3");
        c3.add("4");
        System.out.println(c3);
        System.out.println("size:"+c3.size());
        c3.clear();
        System.out.println("size:"+c3.size());
        System.out.println("是否为空集"+c3.isEmpty());






        //第二遍
        System.out.println("22222222222222222222222222222");
        Collection c2 = new ArrayList();
        c2.add("1");
        c2.add("2");
        c2.add("3");
        c2.add("4");
        c2.add("5");
        System.out.println("是空集："+c2.isEmpty());
        System.out.println("size:"+c2.size());
        c2.clear();
        System.out.println(c2);
        System.out.println("是空集："+c2.isEmpty());
        System.out.println("size:"+c2.size());


        //第一遍
        System.out.println("1111111111111111111111111111");
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        c1.add("e");
        System.out.println(c1);

        isEmpty = c1.isEmpty();
        System.out.println("是空集吗"+isEmpty);
        c1.clear();
        System.out.println(c1);
        System.out.println("size:"+c1.size());
        System.out.println("是空集吗？"+c1.isEmpty());







    }
}
