package file;

import java.io.File;
/**
 * 重载的listFiles方法,允许我们传入一个文件过滤器FileFilter
 * 该方法会将目录中所有满足过滤要求的子项返回,不满足的则被忽略
 */
public interface ListFilesDemo2 {
    public static void main(String[] args) {
        //将当前项目目录下所有名字以"."开始的子项获取
        File dir = new File(".");
        //匿名内部类创建文件过滤器,过滤条件:只接收名字以"."开头的子项
//        FileFilter fileFilter = new FileFilter() {
//            public boolean accept(File sub) {
//                //获取经过当前过滤器的该元素的名字
//                return sub.getName().startsWith(".");
//            }
//        };
        //重载的listFiles方法仅将该目录中所有满足给定过滤器要求的子项返回
//        File[] subs = dir.listFiles(fileFilter);

        //lambda表达式创建文件过滤器
        File[] subs = dir.listFiles(f->f.getName().startsWith("."));

        System.out.println("一共有:"+subs.length+"个子项");
        for(File sub : subs){
            System.out.println(sub.getName());
        }
    }
}
