import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) throws FileNotFoundException {
        double total = 0;
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner fileScan = new Scanner(new File("problem13nums"));
        while (fileScan.hasNext()) {
            nums.add(Double.parseDouble(fileScan.nextLine()));
        }
        System.out.println("Added");
        for (double d : nums) {
            total += d;
        }
        System.out.printf("%.0f\n", total);
    }
}
