package exception;

/**
 * 与finally相关的面试问题
 *
 * 请说明final,finally,finalize是什么?
 * final按照克晶老师笔记回答
 * finally按照FinallyDemo的笔记注释回答
 *
 * finalize是Object类上定义的一个方法,该方法是一个对象生命周期中最后一个被调用的方法.
 * 当GC发现一个对象没有引用后,就要释放该对象,在释放该对象前会调用finalize方法.意味着该
 * 方法调用后对象即被释放删除.
 *
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(
                test("0")+","+test(null)+","+test("")
        );//3,3,3
    }
    public static int test(String s){
        try {
            return s.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e) {
            return 2;
        }finally {
            return 3;//finally中如果包含return,那么上面所有的return全部失效
        }
    }
}

