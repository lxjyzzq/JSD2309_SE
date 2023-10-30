package String;

public class Test {
    public static void main(String[] args) {
        String s1 = "http://www.tedu.com";
        String s2 = "www.tarena.com.cn";
        String name1 =  getHostName(s1);
        String name2 =  getHostName(s2);
        System.out.println(name1);
        System.out.println(name2);
    }

    public static String getHostName(String line){
        int  start = line.indexOf(".")+1;
        int  end = line.indexOf(".", start);
        String name =line.substring(start, end);
        return name;
    }




}
