package String;

public class upperCaseDemo {
    public static void main(String[] args) {
        String line = "我爱Java";
        String upper = line.toUpperCase();
        String lower = line.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(upper.equals(line));


        //第五遍
        upper = line.toUpperCase();
        lower = line.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(lower.equals(line));

        //第四遍
        upper = line.toUpperCase();
        lower = line.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(upper.equals(line.toLowerCase()));

        //第三遍
        upper = line.toUpperCase();
        lower = line.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(lower.equals(line.toUpperCase()));

        //第二遍
        upper = line.toUpperCase();
        lower = line.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(lower.equals(line.toLowerCase()));

        //第一遍
        upper = line.toUpperCase();
        lower = line.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(upper.equals(lower));

        System.out.println(upper.equalsIgnoreCase(lower));


    }
}


