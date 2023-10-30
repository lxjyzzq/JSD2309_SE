package thread;

public class SyncDemo1 {
    public static boolean success1 = false;
    public static boolean success2 = false;
    static int sum =0;//记录尝试次数

    public static void main(String[] args){
        //局部内部类中若使用其他局部变量,这些变量必须是final的.但是局部内部类中由需要改变值,会违背final要求,因此不能在这里定义
//        final boolean success1 = false;
//        final boolean success2 = false;
        //实例化一个Bank
        Bank bank = new Bank();
        while(true) {
            sum++;
            Thread t1 = new Thread() {
                public void run() {
                    success1 = bank.getMoney(20000);
                }
            };
            Thread t2 = new Thread() {
                public void run() {
                    success2 = bank.getMoney(20000);
                }
            };
            t1.start();
            t2.start();
            try {
                /*
                    当主线程执行完上述启动t1和t2的代码后,让主线程阻塞5毫秒(目的是等待t1和t2执行完毕)
                 */
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(success1&&success2){//都为true则说明同时取款成功
                System.out.println("漏洞产生,两个线程同时取款成功!总共尝试了"+sum+"次");
                break;
            }else{
                bank.saveAccount(20000);//将银行账号重新存入20000
            }

        }
    }
}

