package IO;

import java.io.*;

public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //将person.obj文件中的数据进行反序列化得到Person对象
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        /*
            ObjectInputStream的重要方法:
            Object readObject()
            该方法用于进行对象的反序列化
         */
        Person p = (Person)ois.readObject();
        System.out.println(p);

        ois.close();

        /*
        //第五遍
        FileInputStream fis5 = new FileInputStream("person.obj");
        ObjectInputStream ois5 = new ObjectInputStream(fis5);
        Person p5 = (Person)ois5.readObject();
        System.out.println(p5);
        ois5.close();

        //第四遍
        FileInputStream fis4 = new FileInputStream("person.obj");
        ObjectInputStream ois4 = new ObjectInputStream(fis4);
        Person p4 = (Person)ois4.readObject();
        System.out.println(p4);
        ois4.close();

        //第三遍
        FileInputStream fis3 = new FileInputStream("person.obj");
        ObjectInputStream ois3 = new ObjectInputStream(fis3);
        Person p3 = (Person)ois3.readObject();
        System.out.println(p3);
        ois3.close();

        //第二遍
        FileInputStream fis2 = new FileInputStream("person.obj");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        Person p2 = (Person)ois2.readObject();
        System.out.println(p2);
        ois2.close();

        //第一遍
        FileInputStream fis1 = new FileInputStream("person.obj");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        Person p1 = (Person) ois1.readObject();
        System.out.println(p1);
        ois1.close();
*/
    }
}

