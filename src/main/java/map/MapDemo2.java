package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        map.put("生物",94);
        System.out.println(map);

        /*
            遍历所有的key
            Set<K> keySet()
            将当前Map中所有的key以一个Set集合形式返回
         */
        Set<String> KeySet = map.keySet();
        for (String key:
             map.keySet()) {
            System.out.println("Key:"+key);
        }

        /*
            遍历每一组键值对
            Set<Entry> entrySet()
            将当前Map中每一组键值对以一个Entry实例表示,并以Set集合返回
        */
        Set<Map.Entry<String ,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String ,Integer>entry : entrySet
        ) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }


        /*
            遍历所有的value
            Collection<V> values()
            将当前Map中所有的value以一个集合形式返回
         */
        Collection<Integer> values = map.values();
        for (Integer value: values
             ) {
            System.out.println(value);
        }

        /*
            jdk8之后,Map也支持使用lambda表达式遍历
         */
        map.forEach((k,v) -> System.out.println(k+"-"+v));


    }
}


