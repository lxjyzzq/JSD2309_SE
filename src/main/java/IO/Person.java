package IO;

/*
使用该类测试对象的序列化与反序列化
 */

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

    private String name;
    private int age;
    private char gender;
    /*

    如果一个属性被transient修饰，那么该对象序列化时转换的字节中不包含该属性的值
    忽略不必要的属性可以达到对象序列化“瘦身”的目的

     */
    private String[] otherInfo;
//    private transient String[] otherInfo;

    public Person(){}

    public Person(String name, int age, char gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
