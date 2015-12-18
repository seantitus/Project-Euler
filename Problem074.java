import java.util.ArrayList;
public class Problem074 {
    private static int[] factorial;
    private static long next(long l) {
        long total = 0;
        for (String s : String.valueOf(l).split("")) {
            total += factorial[Integer.parseInt(s)];
        }
        return total;
    }
    public static void main(String[] args) {
        factorial = new int[10];
        factorial[0] = 1;
        for (int i = 1; i < 10; i++) {
            factorial[i] = i * factorial[i-1];
        }
        int total = 0;
        for (long l = 1; l < 1000000; l++) {
            ArrayList<Long> chain = new ArrayList<Long>();
            chain.add(l);
            boolean loop = false;
            long next = l;
            while (!loop) {
                next = next(next);
                if (!chain.contains(next)) {
                    chain.add(next);
                } else {
                    loop = true;
                }
            }
            if (chain.size() == 60) {
                total++;
            }
        }
        System.out.println(total);
    }
}
