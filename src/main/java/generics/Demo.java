package generics;

public class Demo {
    public static void main(String[] args) {
        TransferObject to1 = new TransferObject();
        to1.setData("hello");
        to1.setData(123);

        TransferObject<String> to2 = new TransferObject<>();

        to2.setData("hello");


        TransferObject<Integer> to3 = new TransferObject<>();
//        to3.setData("hello");     //类型不匹配
        to3.setData(123);

        Integer i1 = (Integer)to1.getData();

        //to2对象泛型执行为String，因此T getData（）返回值应为String类型
//        Integer i2 = to2.getData();
        String str = to2.getData();

        Integer i3 = to3.getData();


    }
}
