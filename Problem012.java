public class Problem12 {
    public static void main(String[] args) {
        int i = 1;
        int topDivisors = 0;
        int topTriangle = 1;
        while(topDivisors < 501) {
            int triangle = 0;
            int divisors = 0;
            for (int j = 1; j <= i; j++) {
                triangle += j;
            }
            for (int div = 1; div < Math.sqrt(triangle); div++) {
                if (triangle % div == 0) {
                    divisors++;
                }
            }
            divisors *= 2;
            if (Math.sqrt(triangle) % 1 == 0) {
                divisors++;
            }
            if (divisors > topDivisors) {
                topDivisors = divisors;
                topTriangle = triangle;
                System.out.println(triangle + ": " + divisors);
            }
            i++;
        }
        System.out.println(topTriangle);
    }
}
