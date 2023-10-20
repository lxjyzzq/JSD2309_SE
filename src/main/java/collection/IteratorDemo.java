package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("C#");
        System.out.println(c);
        /*
            迭代器使用时也要指定泛型,指定的类型与其遍历的集合元素类型一致即可
            用于告知迭代器从集合中获取的元素是什么类型
         */
        Iterator<String> it = c.iterator();
        /*
            boolean hasNext()
            判断集合是否还有下一个元素可供迭代

            E next()
            获取下一个元素
         */
        while(it.hasNext()){//询问集合是否还有下一个元素
            String e = it.next();//next方法可以获取下一个元素
            System.out.println(e);
            if("#".equals(e)){
                //迭代器遍历过程中不可以通过集合的方法增删元素，否则会抛出异常
//                c.remove(e);
                it.remove();//删除的就是本次next获取的元素
            }
        }
        System.out.println(c);


    }
}

