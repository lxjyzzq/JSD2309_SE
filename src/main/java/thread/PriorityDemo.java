package thread;

/**
 * 线程的优先级
 * 线程有10个优先级,分别用整数1-10表示.
 * 其中1最低,5是默认,10最高
 * 优先级可以最大程度的改善获取时间片的概率,优先级越高的线程获取时间片的次数越多.
 * 线程提供了调整优先级的方法:
 * void setPriority(int priority)
 *
 */

public class PriorityDemo {

    public static void main(String[] args) {
        Thread min = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("min");
                }
            }
        };

        Thread max = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }
            }
        };

        Thread norm = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("nor");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        norm.start();
        max.start();


    }
}
