public class Problem092 {
    private static int[] ends;
    private static boolean is89(int i) {
        if (ends[i] == 89) {
            return true;
        } else if (ends[i] == 1) {
            return false;
        }
        int sum = 0;
        for (String s : String.valueOf(i).split("")) {
            sum += Math.pow(Integer.parseInt(s), 2);
        }
        if (is89(sum)) {
            ends[i] = 89;
            return true;
        }
        ends[i] = 1;
        return false;
    }
    public static void main(String[] args) {
        ends = new int[10000000];
        ends[0] = 1;
        ends[1] = 1;
        ends[89] = 89;
        int total = 0;
        for (int i = 1; i < 10000000; i++) {
            if (is89(i)) {
                total++;
            }
        }
        System.out.println(total);
    }
}
