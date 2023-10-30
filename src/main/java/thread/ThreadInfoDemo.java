package thread;

/**
 * 获取线程相关信息的一组方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取主线程
        //获取线程的名字
        String name = main.getName();
        System.out.println("name:"+name);
        //获取线程的唯一标识
        long id = main.getId();
        System.out.println("id:"+id);
        //获取线程的优先级:1-10之间的整数,默认值:5
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);
        //查看线程是否活着
        boolean isAlive = main.isAlive();
        System.out.println("isAlive:"+isAlive);
        //查看当前线程是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println("是否为守护线程:"+isDaemon);
        //线程是否被中断了
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否被中断:"+isInterrupted);

    }
}

