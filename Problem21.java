public class Problem21 {
    private static int getSum(int i) {
        int sum = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (i != getSum(i) && i == getSum(getSum(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
        
