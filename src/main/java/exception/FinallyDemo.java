package exception;

/**
 * finally块
 * <p>
 * finally块是异常处理机制的最后一块,它可以直接跟在try语句块后,或者最后一个catch之后
 * finally块的特点:
 * 只要程序执行到try语句块中,无论try中是否出现异常,finally最后都必定执行.
 * 因此我们通常将释放资源这类最终一定要干的事情放在finally中确保执行,比如IO操作后的close
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /*
            idea快捷键:
            ctrl+alt+L  自动对齐代码(自动格式化)
            ctrl+alt+T  用指定内容包围选中代码(比如if,for,try-catch等)
         */
        try {
//            String line = null;
            String line = "abc";
            System.out.println(line.length());
            return;
        } catch (Exception e) {
            System.out.println("出错了");
        } finally {
            System.out.println("finally中的代码执行了");
        }

//        System.out.println("finally中的代码执行了");
        System.out.println("程序结束了");

    }
}
