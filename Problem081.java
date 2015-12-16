import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem81 {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] matrix = new int[80][80];
        Scanner fileScan = new Scanner(new File("p081_matrix.txt"));
        int scanInd = 0;
        while (fileScan.hasNext()) {
            String split[] = fileScan.nextLine().split(",");
            for (int ind = 0; ind < 80; ind++) {
                matrix[scanInd][ind] = Integer.parseInt(split[ind]);
            }
            scanInd++;
        }
        for (int i = 79; i > 0; i--) {
            matrix[79][i - 1] += matrix[79][i];
            matrix[i - 1][79] += matrix[i][79];
        }
        for (int i = 78; i >= 0; i--) {
            for (int j = 78; j >= 0; j--) {
                int low = matrix[i + 1][j];
                int right = matrix[i][j + 1];
                matrix[i][j] += (low < right) ? low : right;
            }
        }
        System.out.println(matrix[0][0]);
    }
}
