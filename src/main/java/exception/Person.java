package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<0||age>100){
            //使用throw主动对外抛出异常
//            throw new RuntimeException("年龄不合法");
            /*
                除了RuntimeException(或其子类异常)之外,使用throw抛出任何异常都必须在方法
                上使用throws声明该异常的抛出以达到通知调用者处理的目的.
                throws声明抛出的异常可以是这里实际throw的异常类型或者它的超类型异常.
             */
            throw new Exception("年龄不合法");
        }
        this.age = age;
    }
}

