public class Problem039 {
    public static void main(String[] args) {
        int maxSol = 0;
        int maxP = 0;
        for (int p = 3; p <= 1000; p++) {
            int solutions = 0;
            for (int a = 1; a < p; a++) {
                for (int b = 1; b < p; b++) {
                    if ((Math.sqrt(a * a + b * b) + a + b) == p) {
                        solutions++;
                    }
                }
            }
            if (solutions > maxSol) {
                maxSol = solutions;
                maxP = p;
            }
        }
        System.out.println(maxP);
    }
}
