package String;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String[] data = line.split("[0-9]+");   //Arrays.toString方法可以将一个数组转换为字符串，便于输出
        System.out.println(Arrays.toString(data));

        line = "abc==def==ghi"; //如果连续出现可拆分项目，那么在可拆分项之间会拆分出一个空字符串（不是空格！）
        data = line.split("=");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));

        line = "abc=def=ghi===============";
        data = line.split("=");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));

        line = "123.456.789.";
        data = line.split("\\.");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));

        //第一遍
        line = "abc123def456ghi";
        data = line.split("[0-9]+");

    }
}



