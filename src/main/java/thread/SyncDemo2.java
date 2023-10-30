package thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shopA = new Shop();
        Shop shopB = new Shop();
        Thread t1 = new Thread("Jerry:"){
            public void run(){
                shopA.buy();
            }
        };
        Thread t2 = new Thread("Tom:"){
            public void run(){
                shopB.buy();
            }
        };
        t1.start();
        t2.start();

    }
}

class Shop{
    public void buy(){
        try {

            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"正在挑衣服......");
            Thread.sleep(5000);

            /*
                同步块在使用时要在"()"指定同步监视器对象
                同步监视器对象就是上锁的对象,选取上的基本要求:
                1:多个需要排队执行该同步块的线程看到的同步监视器对象必须是[同一个]
                2:同步监视器对象必须是引用类型

                合适的同步监视器对象:
                在发生并发安全时,多个线程看到的该对象是同一个
                不存在并发安全时,多个线程看到的不应是同一个
             */

            synchronized (this){
                System.out.println(t.getName()+"正在试衣服......");
                Thread.sleep(5000);
            }

            System.out.println(t.getName()+"结账离开");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

