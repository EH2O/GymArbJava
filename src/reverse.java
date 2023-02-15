import java.io.*;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner in;
        String fill = "lormeIpsum.txt";
        try {
            in = new Scanner((new File(fill)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StringBuilder data = new StringBuilder();
        while(in.hasNextLine()){
            data.append(in.nextLine());
        }
        StringBuilder reva = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            reva.append(data.charAt(data.length() - i-1));
        }
        long test =  System.nanoTime();
        System.out.println(test-start);

    }
}
