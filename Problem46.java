public class Problem46 {
    private static int[] primesArray;
    private static boolean isComp(int i) {
        int j = 1;
        while (j <= Math.sqrt(i / 2.0)) {
            if (primesArray[i - 2 * (int) Math.pow(j, 2)] != 0) {
                return true;
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        int limit = 1000000;
        PrimeGen pg = new PrimeGen(limit);
        primesArray = pg.getFullPrimes();
        boolean found = false;
        int i = 3;
        while (!found && i < limit) {
            if (primesArray[i] == 0 && !isComp(i)) {
                found = true;
                System.out.println(i);
            }
            i += 2;
        }
    }
}
