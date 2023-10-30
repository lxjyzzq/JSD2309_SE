package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //生成10个随机整数
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size() < 10) {
            list.add(random.nextInt(100));
        }

        //对集合进行降序排序。比较器使用lambda表达式创建
        Collections.sort(list,(o1,o2)->o2-o1);
        System.out.println(list);

        //使用集合forEach方法遍历输出每个元素
        list.forEach(o->System.out.println(o));
        System.out.println("-------------------");
        list.forEach(System.out::println);

    }
}
