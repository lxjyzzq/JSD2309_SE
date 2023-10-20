package homework.day03homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 *
 * @author Xiloer
 *
 */
public class test4 {
    public static void main(String[] args) {

        //生成10个0-100的随机数并存入一个List集合中并输出
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size()<10){
            int num = random.nextInt(100);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);

        //将集合第3到第6个元素翻转并输出
        List<Integer> list1 = list.subList(2,6);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

    }
}
