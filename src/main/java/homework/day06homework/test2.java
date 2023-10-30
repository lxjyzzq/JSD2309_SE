package homework.day06homework;

import java.io.*;

/**
 * 将当前目录下的所有obj文件获取到，并进行
 * 反序列化后输出每个用户的信息(直接输出反序
 * 列化后的User对象即可)
 * @author Xiloer
 *
 */
public class test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File dir = new File(".");
        File[] subs = dir.listFiles((f)->f.getName().endsWith(".obj"));
        for(int i=0;i<subs.length;i++){

            File sub = subs[i];//从数组中获取每一个obj文件
            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            if(obj instanceof User){
                User user = (User)obj;
                System.out.println(user);
            }
        }
    }
}

