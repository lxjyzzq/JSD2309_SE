package thread;

public class Bank {
    private int account = 20000;

    public synchronized boolean getMoney(int money){
        int account = getAccount();
        if(account >= money){
            account = account -money;
            Thread.yield(); //主动放弃时间片目的，模拟执行到到这里时，cpu时间片用完了
            saveAccount(account);
            return true;
        }
        return false;
    }

    public void saveAccount(int account){
        this.account = account;
    }

    public int getAccount(){
        return account;
    }



    public static void main(String[] args) {

    }

}

