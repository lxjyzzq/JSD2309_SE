package homework.day01homework;

 /* 修改下面代码的错误
         *
         * 下面代码完成的功能是输出字符串中的每一个字符
         *
         * @author Xiloer
        *
        */
public class test3 {
//		string str = "hello world! i love java!";
//		for(int i = 0;i<=str.length;i++) {}
//			char c = i.charAt(i);
//			System.err.println(c);

     public static void main(String[] args) {

         String str = "hello world! i love java!";
         for (int i = 0; i<= str.length()-1;i++){
             System.out.println(str.charAt(i));
         }
     }
}