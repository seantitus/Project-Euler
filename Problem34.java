public class Problem34 {
    public static void main(String[] args) {
        int totalSum = 0;
        int[] factorials = new int[10];
        factorials[0] = 1;
        for (int i = 1; i < 10; i++) {
            factorials[i] = i * factorials[i-1];
        }
        for (int i = 3; i < 10000000; i++) {
            int sum = 0;
            for (String s : String.valueOf(i).split("")) {
                sum += factorials[Integer.parseInt(s)];
            }
            if (sum == i) {
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }
}
