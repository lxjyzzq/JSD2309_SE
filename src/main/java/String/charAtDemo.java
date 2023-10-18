package String;

public class charAtDemo {
    public static void main(String[] args) {
        String str = "www.baidu.com";

        char a = str.charAt(4);
        System.out.println(a);

        char a1 = str.charAt(5);
        System.out.println(a1);

        char a2 = str.charAt(6);
        System.out.println(a2);

        char a3 = str.charAt(7);
        System.out.println(a3);

        char a4 = str.charAt(8);
        System.out.println(a4);

        char a5 = str.charAt(9);
        System.out.println(a5);

        System.out.println("---------------------------------");
        String line = "上海自来水来自海上";
        for(int i = 0;i<line.length()/2;i++){
            char b1 = line.charAt(line.length()-i-1);
            char b2 = line.charAt(i);
            if(b1!=b2){
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文");



        System.out.println("-------------------");
        boolean check = true;
        for(int i = 0;i<line.length()/2;i++){
            char b1 = line.charAt(line.length()-1-i);
            char b2 = line.charAt(i);
            if(b1 != b2){
                System.out.println("不是回文");
                check = false;
                break;
            }
        }
        if (check == true){
            System.out.println("是回文");
        }

        System.out.println("--------------------------");
        for (int i = 0; i<line.length()/2;i++){
            char b1 = line.charAt(line.length()-1-i);
            char b2 = line.charAt(i);
            if(b1 != b2){
                System.out.println("不是回文");
                return;
            }
        }
        System.out.println("是回文");


        System.out.println("**************************");
        for (int i = 0;i<line.length()/2;i++){
            char b1 = line.charAt(line.length()-1-i);
            char b2 = line.charAt(i);
            if(b1 != b2){
                System.out.println("不是回文");
                return;
            }
        }
        System.out.println("是回文");


        System.out.println("44444444444444444444444444444");
        check = true;
        for (int i = 0;i<line.length();i++){
            char b1 = line.charAt(line.length()-1-i);
            char b2 = line.charAt(i);
            if(b1 != b2){
                System.out.println("不是回文");
                check = false;
                break;
            }
        }
        if(check = true){
            System.out.println("是回文");
        }

        System.out.println("55555555555555555555555555555555555");
        for (int i = 0;i<line.length()/2;i++){
            char b1 = line.charAt(line.length()-1-i);
            char b2 = line.charAt(i);
            if(b1 != b2){
                System.out.println("不是回文");
                return;
            }
        }
        System.out.println("是回文");


    }
}

