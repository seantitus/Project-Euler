public class Problem9 {
    public static void main(String[] args) {
        for (int a = 998; a > 0; a--) {
            for (int b = 999 - a; b > 0; b--) {
                double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
                if (c % 1 == 0 && a + b + c == 1000) {
                    System.out.printf("%.0f\n", a * b * c);
                }
            }
        }
    }
}
