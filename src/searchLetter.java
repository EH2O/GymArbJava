import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class searchLetter {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner((new File("src/lormeIpsum.txt")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String data = "";
        while(in.hasNextLine()){
            data += in.nextLine();
        }
        int letterCount = 0;

        long start = System.nanoTime();

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 's') {
                letterCount++;
            }
        }
        long test =  System.nanoTime();

        double end =(( test - start))/1000000.0;
        System.out.println(end);
        System.out.println(letterCount);
    }
}
