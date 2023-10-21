package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*
            String实现了Comparable接口
            String默认的比较规则是按照字符的unicode编码对应的数字大小比较的。
            如果第一个字符相同则比较第二个，以此类推
         */
//        list.add("Tom");
//        list.add("jerry");
//        list.add("jack");
//        list.add("rose");
//        list.add("kobe");
//        list.add("james");
//        list.add("Ada");
//        list.add("bill");
//        list.add("Bob");
        //排序中文时，按照unicode编码比较则没有实际意义了
        list.add("克晶老师");
        list.add("传奇");
        list.add("王伟超");
        System.out.println(list);
//        Collections.sort(list);
        //自定义排序规则:字少的小，字多的大
        Comparator<String> com = new Comparator<String>(){
            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
                return o2.length()-o1.length();//反过来相减就实现了降序
            }
        };
        Collections.sort(list,com);

        System.out.println(list);
    }
}


