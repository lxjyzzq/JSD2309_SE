package homework.day02homework;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 *
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 *
 *
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 *
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 * @author Xiloer
 *
 */


//1.  [0-9]+
//2.  [a-zA-Z0-9_]{3,15}

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scan.nextLine();
        String regex = "[0-9]+[a-zA-Z0-9_]{3,15}";
        if(regex.matches(name)){
            System.out.println("请输入年龄");
            String age = scan.nextLine();
            String regex1 = "[0-9]";
            if(regex1.matches(age)){
                int iage = Integer.parseInt(regex1);
                if(iage >= 1 && iage <= 100){
                    System.out.println("名字是："+name);
                    System.out.println("年龄是："+ age);
                }
                else{
                    System.out.println("年龄错误");
                }
            }

//            int age = scan.nextInt();
//            if(1 <= age && 100 >= age){
//                System.out.println("名字是："+name);
//                System.out.println("年龄是："+ age);
//            }
//            else{
//                System.out.println("年龄不对");
//            }

        }
        else {
            System.out.println("用户名错误");
        }

    }
}



