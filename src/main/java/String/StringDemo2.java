package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "a";
        for(int i = 0; i < 1000000;i++){
            s = s + s;
        }
        System.out.println("5555");
    }
}

