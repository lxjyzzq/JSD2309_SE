package lambda;

import java.util.Comparator;

/**
 * lambda表达式
 * lambda表达式可以用更简洁的语法创建匿名内部类
 * lambda表达式又称为"箭头函数",主要目的是省去了匿名内部类创建时接口与方法的编写,可以
 * 更突出重写方法的逻辑部分.
 * 只有当实现的接口中包含唯一一个抽象方法时才可以使用lambda表达式
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //匿名内部类创建比较器
        Comparator<String> c1 = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        //lambda表达式
        Comparator<String> c2 =(String o1, String o2)->{
            return o1.length()-o2.length();
        };

        //lambda表达式中,参数的类型可以忽略不写
        Comparator<String> c3 =(o1,o2)->{
            return o1.length()-o2.length();
        };

        //lambda表达式中只有一句代码时,方法体的{}可以不写,并且如果这句话含有return,return也必须一同忽略
        Comparator<String> c4 =(o1,o2)->o1.length()-o2.length();

    }
}
