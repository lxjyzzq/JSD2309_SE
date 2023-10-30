package String;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String newLine = line.replaceAll("[0-9]+","NUMBER");
        System.out.println(newLine);

        //第五遍
        newLine = line.replaceAll("[a-z]+","666");
        System.out.println(newLine);

        //第四遍
        newLine = line.replaceAll("[a-z]+","啊啊啊");
        System.out.println(newLine);

        //第三遍
        newLine = line.replaceAll("[0-9]+","呵呵呵");
        System.out.println(newLine);

        //第二遍
        newLine = line.replaceAll("[0-9]+","嘿嘿嘿");
        System.out.println(newLine);

        //第一遍
        newLine = line.replaceAll("[a-z]+","哈哈哈");
        System.out.println(newLine);



    }
}
