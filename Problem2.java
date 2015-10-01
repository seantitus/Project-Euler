public class Problem2 {
    public static void main(String[] args) {
        int total = 0;
        int prev = 1;
        int current = 1;
        while (current <= 4000000) {
            if (current % 2 == 0) {
                total += current;
            }
            int placeholder = current;
            current += prev;
            prev = placeholder;
        }
        System.out.println(total);
    }
}
