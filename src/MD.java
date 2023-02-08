public class MD {
    public static void main(String[] args) {
        double x = 3.2;
        double y = 7.5;
        double z = x*y;
        double start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            if (z < i){
                z = z*x;
            }
            else{
                z = z/y;
            }
        }
        double end =(long) ((System.currentTimeMillis() - start));
        System.out.println(z + " tid:  " + end );
    }
}
