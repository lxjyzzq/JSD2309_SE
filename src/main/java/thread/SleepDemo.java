package thread;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("结束");
    }
}
