package exception;

import java.util.Scanner;
/**
 * throw关键字,用于主动抛出一个异常
 * 通常以下情况可以主动抛出一个异常:
 * 1:出现了一个异常,但是该异常不应在当前方法中被处理时,可以主动抛出给调用者处理
 * 2:当前方法出现了满足语法但是不满足业务的情况,可以主动抛出一个异常给调用者
 *   本案例就是演示第2种情况
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        try {
            /*
                当调用一个含有throws声明异常抛出的方法时,编译器要求必须处理该异常,否则编译
                不通过,而处理方式有两种可选:
                1:在当前方法(本案例为main方法)上继续使用throws声明该异常的抛出给上层调用者处理
                2:主动使用try-catch捕获并处理异常
                具体选取哪个要结合实际业务场景决定(责任制)
             */
            p.setAge(scan.nextInt());
        } catch (ileagalAgeException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("年龄是"+p.getAge());

    }
}
