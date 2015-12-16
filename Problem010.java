public class Problem10 {
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(200000000);
        System.out.println("Done");
        double total = 0;
        for (int i : pg.getPrimesList()) {
            total += i;
        }
        System.out.printf("%.0f\n", total);
    }
}
