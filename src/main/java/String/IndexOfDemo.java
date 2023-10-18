package String;

public class IndexOfDemo {
    public static void main(String[] args) {


        String str = "thinking in java";
        int index = str.indexOf("IN");
        System.out.println(index);

        index = str.indexOf("in",2);
        System.out.println(index);

        index = str.indexOf("in", 3);
        System.out.println(index);

        index = str.lastIndexOf("in");  //检索最后一次出现in的位置
        System.out.println(index);

        index = str.indexOf("in", 6);
        System.out.println(index);

        index = str.lastIndexOf("in");
        System.out.println(index);

        index = str.lastIndexOf("in", 4);
        System.out.println(index);

        index = str.lastIndexOf("in", 1);
        System.out.println(index);

        index = str.lastIndexOf("in", 1);
        System.out.println(index);

        index = str.lastIndexOf("in");
        System.out.println(index);

        index = str.indexOf("in");
        System.out.println(index);

        index = str.indexOf("in", 5);
        System.out.println(index);



    }
}
