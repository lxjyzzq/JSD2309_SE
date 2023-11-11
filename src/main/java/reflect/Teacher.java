package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Teacher {
    public String name;

    @AutoRunMethod
    public void teach(){
        System.out.println("老师:在讲课");
    }
    public void sing(){
        System.out.println("老师:在唱歌");
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
