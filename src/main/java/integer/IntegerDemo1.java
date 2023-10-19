package integer;

public class IntegerDemo1 {
    public static void main(String[] args) {
        int i = 123;
        Integer i1 = Integer.valueOf(i);
        Integer i2 = Integer.valueOf(i);
        Integer i3 = new Integer(123);
        Integer i4 = new Integer(123);
        System.out.println(i3==i4); //true
        System.out.println(i1==i2); //true
        System.out.println(i1.equals(i2));  //true

        double dou = 123.123;
        Double dou1 = Double.valueOf(dou);//Double则是直接new
        Double dou2 = Double.valueOf(dou);
        System.out.println(dou1==dou2);//false
        System.out.println(dou1.equals(dou2));//true

        //包装类转换为基本类型
        int in = i1.intValue();//获取包装类对象中表示的基本类型值
        double doub = i1.doubleValue();
        System.out.println(in);//123
        System.out.println(doub);//123.0

        in = dou1.intValue();//大类型转小类型可能存在丢精度!
        doub = dou1.doubleValue();
        System.out.println(in);//123
        System.out.println(doub);//123.123

        byte b = i1.byteValue();
        System.out.println(b);


    }
}
