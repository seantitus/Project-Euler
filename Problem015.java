public class Problem15 {
    public static void main(String[] args) {
        long[][] matrix = new long[21][21];
        for (int i = 20; i >= 0; i--) {
            matrix[20][i] = 1;
            matrix[i][20] = 1;
        }
        for (int i = 19; i >= 0; i--) {
            for (int j = 19; j >= 0; j--) {
                long low = matrix[i + 1][j];
                long right = matrix[i][j + 1];
                matrix[i][j] = low + right;
            }
        }
        System.out.println(matrix[0][0]);
    }
}
