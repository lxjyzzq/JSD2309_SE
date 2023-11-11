package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Worker {
    @AutoRunMethod
    public void work(){
        System.out.println("工人在工作");
    }
}
