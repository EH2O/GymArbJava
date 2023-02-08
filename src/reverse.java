import java.io.*;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner in;
        String fill = "src/loremIpsum.txt";
        try {
            in = new Scanner((new File(fill)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StringBuilder data = new StringBuilder();
        while(in.hasNextLine()){
            data.append(in.nextLine());
        }

        StringBuilder rev = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            rev.append(data.charAt(data.length() - i));
        }
        long test =  System.nanoTime();
        System.out.println(start-test);

    }
}