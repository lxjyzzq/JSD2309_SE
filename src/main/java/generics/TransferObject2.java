package generics;

import java.util.Collection;
import java.util.List;

/**
 * 泛型边界定义
 */
//extends可以限定指定的类型必须是extends后面指定类或其子类型
public class TransferObject2<T extends Collection> {
    private T data;

    //为方法单独定义一个泛型类型且指定类型的边界
    public <S extends List> void doSome(S s){
//    public <S> void doSome(S s){//不设定边界

    }

    //静态方法上无法引用类上指定的泛型
//    public static T doSomething(T t){
    //静态方法上使用泛型必须要声明
    public static<T> T doSomething(T t){
        return null;
    }
}
