import java.util.Arrays;
public class Problem031 {
    private static int combinations(int[] coins, int total) {
        if (coins.length == 0) {
            return 0;
        }
        if (total == 0) {
            return 1;
        }
        if (total - coins[0] >= 0) {
            int temp = combinations(coins, total - coins[0]);
            temp += combinations(Arrays.copyOfRange(coins, 1, coins.length),
                total);
            return temp;
        } else {
            return combinations(Arrays.copyOfRange(coins, 1, coins.length),
                total);
        }
    }
    public static void main(String[] args) {
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        System.out.println(combinations(coins, 200));
    }
}
