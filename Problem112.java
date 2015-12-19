public class Problem112 {
    private static boolean isDecr(int i) {
        String[] nums = String.valueOf(i).split("");
        for (int j = 1; j < nums.length; j++) {
            if (Integer.parseInt(nums[j]) > Integer.parseInt(nums[j - 1])) {
                return false;
            }
        }
        return true;
    }
    private static boolean isIncr(int i) {
        String[] nums = String.valueOf(i).split("");
        for (int j = 1; j < nums.length; j++) {
            if (Integer.parseInt(nums[j]) < Integer.parseInt(nums[j - 1])) {
                return false;
            }
        }
        return true;
    }
    private static boolean isBouncy(int i) {
        if (isIncr(i)) {
            return false;
        }
        if (isDecr(i)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int bouncy = 0;
        int nonBouncy = 0;
        int i = 1;
        while (((double) bouncy) / (nonBouncy + bouncy) != .99) {
            if (isBouncy(i)) {
                bouncy++;
            }
            else {
                nonBouncy++;
            }
            if (((double) bouncy) / (nonBouncy + bouncy) == .99) {
                System.out.println(i);
            }
            i++;
        }
    }
}
