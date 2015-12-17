public class Problem045 {
    public static boolean isPent(double d) {
        double n = (1 + Math.sqrt(1 + 24 * d)) / 6;
        return n % 1 == 0;
    }
    public static boolean isHex(double d) {
        double n = (1 + Math.sqrt(1 + 8 * d)) / 4;
        return n % 1 == 0;
    }
    public static void main(String[] args) {
        int found = 0;
        long i = 0;
        while (found < 3) {
            double triangle = i * (i + 1) / 2;
            if (isPent(triangle) && isHex(triangle)) {
                System.out.printf("%.0f\n", triangle);
                found++;
            }
            i++;
        }
    }
}
