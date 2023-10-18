package String.day01homework;

import java.util.Scanner;

public class test2 {

    /**
     * 要求用户在控制台输入自己的用户名。
     * 然后要求做如下验证工作:
     * 1:用户名不能为空(只要有一个字符)
     * 2:用户名必须在20个字以内
     * @author Xiloer
     *
     */

    public static void main(String[] args) {
        System.out.println("请输入用户名");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if(name.trim().length()>=0 && name.trim().length()<=20){
            System.out.println("符合");
        }
        else {
            System.out.println("不符合");
        }
    }
}
