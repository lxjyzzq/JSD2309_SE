package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 测试泛型边界
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
            此时指定的泛型实际类型应当是Collection或其子类型,否则编译不通过
         */
//        TransferObject2<String> t = new TransferObject2<>();
//        TransferObject2<Integer> t2 = new TransferObject2<>();

        TransferObject2<List> t = new TransferObject2<>();

//        t.doSome(new HashSet());//不符合doSome方法泛型要求
        t.doSome(new ArrayList());
    }
}
