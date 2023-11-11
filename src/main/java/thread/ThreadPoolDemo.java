package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
线程池
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建一个固定大小的线程池，容量为2（内部只有2条线程）
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread t = Thread.currentThread();
                        System.out.println(t.getName()+":正在执行任务.....");
                        Thread.sleep(5000);
                        System.out.println(t.getName()+":执行任务完毕");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            threadPool.execute(r);
            System.out.println("将一个任务交给了线程池");
        }
//        threadPool.shutdownNow();
        threadPool.shutdown();
        System.out.println("线程池关闭了");
    }
}

