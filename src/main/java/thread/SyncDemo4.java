package thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    sb.append("abc");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    sb.append("def");
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
        System.out.println(sb.length());
        System.out.println(sb);

    }
}
