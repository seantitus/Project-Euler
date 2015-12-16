import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File("Problem8Text"));
        String numbers = "";
        while (fileScan.hasNext()) {
            numbers += fileScan.nextLine().trim();
        }
        String lString = "";
        double largest = 0;
        for (int i = 13; i <= 1000; i++) {
            String[] split = numbers.substring(i - 13, i).split("");
            double total = 1;
            for (String s : split) {
                total *= Integer.parseInt(s);
            }
            if (total > largest) {
                lString = numbers.substring(i - 13, i);
                largest = total;
            }
        }
        System.out.printf("%f\n", largest);
    }
}
