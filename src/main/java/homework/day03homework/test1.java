package homework.day03homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 改错题
 *
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class test1 {
    public static void main(String[] args) {
//		List<int> list = new List<int>();
        List<Integer> list = new ArrayList<>();
//		Iterator it = list.iterator();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
    }
}

