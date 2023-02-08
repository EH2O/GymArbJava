public class Addition {
    public static void main(String[] args) {
        int x = 10;

        int prex =30;
        double start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {


                if(i % 2 == 0){
                    x += 203455;
                }else {
                    x -= 203455;
                }


        }
        double end =(long) ((System.currentTimeMillis() - start));
        System.out.println(x);
        System.out.println(end);
    }
}
