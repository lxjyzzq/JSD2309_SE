package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------------------");
        //将Person对象序列化后写入磁盘文件person.obj中
        String name = "王克晶";
        int age = 18;
        char gender = '女';
        String[] otherInfo = {"嗓门大","黑","技术好","JAVA的启蒙老师"};
        Person p = new Person(name,age,gender,otherInfo);
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("Person.obj");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /*
        对象输出流提供了对象序列化的方法：
        void writeObjetc(Object obj)

        该方法有一个要求：序列化的对象
         */
        oos.writeObject(p);
        System.out.println("写出完毕");
        oos.close();


    }
}
