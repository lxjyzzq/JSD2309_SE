package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        String line = "i love java thinking in java helloworld";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {

            String a =  Character.toString(line.charAt(i));
            if(map.containsKey(a)){
                Integer value = map.get(a);
                value++;
                map.put(a, value);
            }
            else {
                map.put(a, 1);
            }
        }

        System.out.println(map);
    }
}
