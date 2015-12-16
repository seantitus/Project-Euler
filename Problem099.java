import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem99 {
    public static void main(String[] args) throws FileNotFoundException {
        double largest = 0;
        int largestIndex = 0;
        Scanner fileScan = new Scanner(new File("p099_base_exp.txt"));
        int i = 1;
        while (fileScan.hasNext()) {
            String[] line = fileScan.nextLine().split(",");
            int base = Integer.parseInt(line[0]);
            int exp = Integer.parseInt(line[1]);
            double log = exp * Math.log(base);
            if (log > largest) {
                largest = log;
                largestIndex = i;
            }
            i++;
        }
        System.out.println(largestIndex);
    }
}
