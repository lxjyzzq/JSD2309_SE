package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        System.out.println(collection);

//        Consumer<String> consumer = new Consumer<String>() {
//            public void accept(String o) {
//                System.out.println(o);
//            }
//        };
//        c.forEach(consumer);

        //lambda:如果方法只有一个参数时,参数列表中的"()"可以忽略不写
//        Consumer<String> consumer = o->System.out.println(o);
//        c.forEach(consumer);


        collection.forEach(o->System.out.println(o));
//        类比新循环
//        for(String o : c){
//            System.out.println(o);
//        }

        /*
            方法引用:lambda表达式的特殊写法
            对象::方法名(成员方法)
            类名::方法名(静态方法)

            当lambda表达式的参数列表与lambda表达式调用的方法参数列表相同时,
            可以简写为方法引用
            举例:
            (o)->System.out.println(o)
             ^                      ^
        lambda参数列表            lambda表达式调用的方法参数列表
                它们长得一样时,可以简写为方法引用:
              System.out::println

         */
        collection.forEach(System.out::println);



    }
}


