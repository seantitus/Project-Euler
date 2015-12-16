public class Problem30 {
    private static int digitSum(int num) {
        int total = 0;
        for (String s : String.valueOf(num).split("")) {
            total += Math.pow(Integer.parseInt(s), 5);
        }
        return total;
    }
    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i < 1000000; i++) {
            if (i == digitSum(i)) {
                System.out.println(i);
                total += i;
            }
        }
        System.out.println("Total: " + total);
    }
}
