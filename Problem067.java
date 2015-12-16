import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Problem67 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File("triangle"));
        int[][] nums = new int[100][];
        int i = 0;
        while (fileScan.hasNext()) {
            String[] temp = fileScan.nextLine().split(" ");
            nums[i] = new int[temp.length];
            for (int j = 0; j < temp.length; j++) {
                nums[i][j] = Integer.parseInt(temp[j].trim());
            }
            i++;
        }
        for (i = 98; i >= 0; i--) {
            for (int j = 0; j < nums[i].length; j++) {
                int num1 = nums[i+1][j];
                int num2 = nums[i+1][j+1];
                nums[i][j] += num1 > num2 ? num1 : num2;
            }
        }
        System.out.println(nums[0][0]);
    }
}
