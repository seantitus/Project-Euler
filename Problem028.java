public class Problem028 {
    public static void main(String[] args) {
        int total = 1;
        int last = 1;
        for (int layer = 1; layer < 501; layer += 1) {
            for (int i = 0; i < 4; i++) {
                last += layer * 2;
                total += last;
            }
        }
        System.out.println(total);
    }
}
