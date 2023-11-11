package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Student {
    private String name = "张三";
    private int age = 18;
    private char gender = '男';
    public Student(){}

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @AutoRunMethod
    public void study(){
        System.out.println("学生"+name+":good good study!day day up!");
    }

    public void playGame(){
        System.out.println("学生"+name+":玩游戏");
    }

    @AutoRunMethod
    public void sleep(){
        System.out.println("学生"+name+":睡觉");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
