package homework.day04homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 在一个List集合中生成20个随机整数(100以内)
 * 然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
 * 按照从大到小顺序排列，并最终输出集合
 * 例如:
 * 1,2,3,4,5,15,14,13,12,11,10,9,8,7,6,16,17,18,19,20
 * @author pc
 *
 */
public class test1 {
    public static void main(String[] args) {

        //生成20个随机整数
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            list.add(random.nextInt(100));
        }

        //然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
//        Collections.sort(list,(o1, o2)->o2-o1);
        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list.subList(5,15),(o1,o2)->o2-o1);

        //使用集合forEach方法遍历输出每个元素
        list.forEach(o->System.out.println(o));
        System.out.println("---------下面是第二种方法----------");
        list.forEach(System.out::println);


    }
}

