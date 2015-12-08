public class Problem6 {
    public static void main(String[] args) {
        int limit = 100;
        double sumsquare = 0;
        double squaresum = 0;
        for (int i = 0; i <= limit; i++) {
            squaresum += i;
            sumsquare += Math.pow(i, 2);
        }
        squaresum = Math.pow(squaresum, 2);
        System.out.printf("%.0f\n", squaresum - sumsquare);
    }
}
