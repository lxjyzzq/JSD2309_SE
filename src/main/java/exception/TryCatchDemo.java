package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");

        try {
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现了空指针异常，没有解决");
            //catch可以定义多个，针对try中不用异常有不同处理方式时，可以分别捕获
        }
        catch (Exception e){
            System.out.println("有问题");
        }
//        catch (StringIndexOutOfBoundsException e){
//            System.out.println("是的法国红酒凯乐科技辉光放电法国红酒看");
//        }
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbb");


    }
}

