package String;

import java.util.Scanner;

public class StringMathesDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个邮箱:");
        String mail = scan.nextLine();
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = mail.matches(regex);
        if (match) {
            System.out.println("是邮箱");
        } else {
            System.out.println("不是邮箱");
        }

        //第五遍
        System.out.println("请输入邮箱");
        String mail5 = scan.nextLine();
        String a5 = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match5 = mail5.matches(a5);
        if(match5){
            System.out.println("是");
        }
        else {
            System.out.println("不是");
        }

        //第四遍
        System.out.println("请输入邮箱");
        String mail4 = scan.nextLine();
        String a4 = "[a-z0-9A-Z_]+@[0-9a-zA-Z]+(\\.[a-zA-Z]+)+";
        boolean match4 = mail4.matches(a4);
        if(match4){
            System.out.println("是");
        }
        else {
            System.out.println("不是");
        }

        //第三遍
        System.out.println("请输入邮箱");
        String mail3 = scan.nextLine();
        String a3 = "[a-zA-Z0-9_]+@[0-9a-zA-Z]+(\\.[a-zA-Z]+)+";
        boolean match3 = mail3.matches(a3);
        if(match3){
            System.out.println("是邮箱");
        }
        else {
            System.out.println("不是邮箱");
        }

        //第二遍
        System.out.println("请输入邮箱");
        String  mail2 = scan.nextLine();
        String a2 = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match2 = mail2.matches(a2);
        if(match2){
            System.out.println("是邮箱");
        }
        else {
            System.out.println("不是邮箱");
        }


        //第一遍
        System.out.println("请输入邮箱");
        String mail1 = scan.nextLine();
        String a = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match1 = mail1.matches(a);
        if (match1){
            System.out.println("是邮箱");
        }
        else {
            System.out.println("不是邮箱");
        }




    }
}
