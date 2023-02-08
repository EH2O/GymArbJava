public class Addition {
    public static void main(String[] args) {
        int x = 10;

        int prex =30;
        double start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            x += 1;
            if(x == prex){
                x -= 3000;
                prex = prex*2;
            }
        }
        double end =(long) ((System.currentTimeMillis() - start));
        System.out.println(x);
        System.out.println(end);
    }
}
