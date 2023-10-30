package exception;

public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        try{
            String line = "abc";
//            int line = "abc";
            System.out.println(Integer.parseInt(line));
        }catch (NumberFormatException e){
            e.printStackTrace();    //向控制台输出错误信息
            String message = e.getMessage();
            System.out.println(message);    //获取错误信息
        }
        System.out.println("结束");
    }
}
