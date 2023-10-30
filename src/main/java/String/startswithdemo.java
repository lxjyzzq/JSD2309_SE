package String;

public class startswithdemo {
    public static void main(String[] args) {

        String line = "www.tedu.com";
        boolean starts = line.startsWith("www");
        System.out.println("start:"+starts);
        boolean ends = line.endsWith("com");
        System.out.println("end:"+ends);

        //第二遍
        boolean start2 = line.startsWith("www");
        System.out.println("start:"+start2);
        boolean start3 = line.endsWith("www");
        System.out.println("end:"+ends);


        //第一遍
        boolean start1 = line.startsWith("ww");
        System.out.println("start:"+start1);
        boolean end1 = line.endsWith("cn");
        System.out.println("end" + end1);




    }
}
