package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
//        Map<String,Integer> map = new LinkedHashMap<>();
        Integer value = map.put("语文",55);
        System.out.println(value);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        value = map.put("语文",75);

        System.out.println(value);
        value = map.put("语文",56);
        System.out.println(value);

        value = map.get("体育");
        System.out.println(value);
        value = map.get("语文");
        System.out.println(value);
        map.put(null,null);
        System.out.println(map);

        int size = map.size();
        System.out.println(size);

        /*
        boolean containsKey
        判断当前map是否包含给定的key
        boolean containsValue
        判断当前map是否包含指定的value
         */
        boolean ck = map.containsKey("英语");
        boolean cv = map.containsValue(97);
        System.out.println(ck);
        System.out.println(cv);
        map.remove(null);
        System.out.println(map);




    }
}

