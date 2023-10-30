package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread rose = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("Rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("啊啊啊啊啊啊AAAAAaaaaaaaaa............");
                System.out.println("die");
            }
        };

        Thread jack = new Thread(){
            public void run(){
                while(true){
                    System.out.println("Jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        rose.start();
        jack.setDaemon(true);//设置为守护线程,必须在线程启动前进行设置否则会抛出异常
        jack.start();

//        while (true);//如果main方法不结束，Jack是不会结束的

    }
}

