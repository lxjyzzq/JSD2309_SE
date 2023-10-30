package apidoc;

/**
 * 文档是功能级注释，用在类上，方法上，常量上，构造器上定义，说明整体功能
 * 在类上使用时用来说明当前类的作用
 * @author 张之强
 * @version 1.0
 * @see java.lang.String
 * @since JDK 1.8
 *
 */


public class DocDemo {
    public static final String INFO = "hello";
    /**
     * 为指定的用户添加一个问候语
     * @param name 要添加问候语的用户的名字
     * @return     添加了问候语的字符串
     */
    public String sayHello(String name){
        return INFO +name ;
//        return "hello" + name;

    }
}

