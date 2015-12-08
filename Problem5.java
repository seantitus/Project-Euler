public class Problem5 {
    public static void main(String[] args) {
        int limit = 100;
        double sumsquare = 0;
        for (int i = 0; i <= limit; i++) {
            sumsquare += Math.pow(i, 2);
        }
        double squaresum = 0;
        for (int i = 0; i <= limit; i++) {
            squaresum += i;
        }
        squaresum = Math.pow(squaresum, 2);
        System.out.println(sumsquare);
        System.out.println(squaresum);
        System.out.printf("%.0f\n", squaresum - sumsquare);
    }
}
