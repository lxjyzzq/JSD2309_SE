package thread;


/**
 * 静态方法上如果指定synchronized,那么该方法一定具有同步效果
 * 静态方法上使用时锁对象为当前类的类对象(Class的实例)
 * 类对象会在后面学习反射知识时介绍
 */

public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Boo.doSome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                Boo.doSome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
    public synchronized static void doSome(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行doSome方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行doSome方法完毕!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




class Boo1{
    public synchronized static void doSome(){
        synchronized (Boo1.class){
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName()+":正在执行doSome方法");
                Thread.sleep(5000);
                System.out.println(t.getName()+":执行doSome方法完毕!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


