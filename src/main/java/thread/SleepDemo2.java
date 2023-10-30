package thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread("林永健:"){
            public void run(){
                System.out.println(getName()+":睡一会吧");
                try {
                    Thread.sleep(300000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getName()+"醒了");
            }
        };

        Thread huang = new Thread("黄宏"){
            public void run(){
                System.out.println(getName()+":大锤80，小锤40");
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName()+":80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(":砸开了");
                System.out.println(getName()+":大哥，搞定！");
            }
        };
        lin.start();
        huang.start();
    }
}

