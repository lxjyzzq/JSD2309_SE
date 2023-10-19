package integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //获取int的最大值
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(lmax);
        System.out.println(lmin);

        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println(dmax);
        System.out.println(dmin);

        float fmax = Float.MAX_VALUE;
        float fmin = Float.MIN_VALUE;
        System.out.println(fmax);
        System.out.println(fmin);

        byte bmax = Byte.MAX_VALUE;
        byte bmin = Byte.MIN_VALUE;
        System.out.println(bmax);
        System.out.println(bmin);

        String line = "123";
        int n = Integer.parseInt(line);
        System.out.println(n);

        double d = Double.parseDouble(line);
        System.out.println(d);


    }
}


