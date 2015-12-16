import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] nums = new int[20][20];
        Scanner fileScan = new Scanner(new File("problem11nums"));
        int row = 0;
        while (fileScan.hasNext()) {
            int col = 0;
            String line = fileScan.nextLine();
            for (String s : line.split(" ")) {
                nums[row][col] = Integer.parseInt(s.trim());
                col++;
            }
            row++;
        }
        int largest = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i < 17) {
                    int temp = nums[i][j] * nums[i+1][j] * nums[i+2][j]
                        * nums[i+3][j];
                    if (temp > largest) {
                        largest = temp;
                    }
                    if (j < 17) {
                        int temp1 = nums[i][j] * nums[i+1][j+1] * nums[i+2][j+2]
                            * nums[i+3][j+3];
                        if (temp1 > largest) {
                            largest = temp1;
                        }
                    }
                    if (j > 3) {
                        int temp2 = nums[i][j] * nums[i+1][j-1] * nums[i+2][j-2]
                            * nums[i+3][j-3];
                        if (temp2 > largest) {
                            largest = temp2;
                        }
                    }
                }
                if (j < 17) {
                    int temp = nums[i][j] * nums[i][j+1] * nums[i][j+2]
                        * nums[i][j+3];
                    if (temp > largest) {
                        largest = temp;
                    }
                }
            }
        }
    System.out.println(largest);
    }
}
                
                
