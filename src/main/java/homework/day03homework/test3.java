package homework.day03homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class test3 {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size()<10){
            int num = random.nextInt(100);
            if (!list.contains(num)) {
                list.add(num);
            }
//            list.add(num);
        }
        System.out.println(list);
    }
}
