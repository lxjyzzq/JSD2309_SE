package homework.day02homework;

/**
 * 执行程序，分析并解决问题
 *
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 *
 *
 * @author Xiloer
 *
 */
public class test4 {
    public static void main(String[] args) {
        /*
         * 原因:
         */
        String num = "123 ";
        num = "123";     //字符串有空格
        int d = Integer.parseInt(num);
        System.out.println(d);

        /*
         * 原因:
         */
        num = "123.456";
        num = "123";    //整型无法处理浮点型
        d = Integer.parseInt(num);
        System.out.println(num);  //需要输出d
        System.out.println(d);  //需要输出d

        /*
         * 原因:
         */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);  //分号错误
    }
}
