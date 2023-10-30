package thread;

import java.util.*;

public class SyncDemo5 {
    public static void main(String[] args) {

//        List<Integer> c = new ArrayList<>();
//        Set<Integer> c = new HashSet<>();
        List<Integer> c = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.add(i);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                for (int i = 1000; i < 2000; i++) {
                    c.add(i);
                }
            }
        };

        t1.start();
        t2.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.size());

    }
}

