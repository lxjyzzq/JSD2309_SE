package String;

public class Test2 {
    public static void main(String[] args) {
        String file = "java.jpg";
        String[] data = file.split("\\.");
//        for (int i = 0; i< data.length-1; i++){
//            System.out.print(data[i]);
//        }
//        int a = file.lastIndexOf(".");
//        System.out.println("文件名："+file.substring(0,a-1));
//        System.out.println("后缀："+file.substring(a-1, data.length));

        System.out.println("----------------");
        System.out.println("文件名："+data[0]);
        System.out.println("后缀："+data[data.length-1]);
    }
}
