import java.util.HashSet;
public class Problem29 {
    public static void main(String[] args) {
        HashSet<Double> terms = new HashSet<Double>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                terms.add(Math.pow(a, b));
            }
        }
        System.out.println(terms.size());
    }
}
