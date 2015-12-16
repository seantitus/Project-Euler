import java.util.HashMap;
public class Problem44 {
    private static HashMap<Long, Long> pents;
    private static long n;
    private static void addPent() {
        n++;
        pents.put(n, (n * (3 * n - 1) / 2));
    }
    private static boolean isPent(long l) {
        if (((1 + Math.sqrt(24 * l + 1)) / 6) % 1 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        long lowN = 1;
        pents = new HashMap<Long, Long>();
        n = 0;
        addPent();
        addPent();
        long smallestDiff = Long.MAX_VALUE;
        long[] nums = new long[2];
        long pentDiff = 0;
        long index = 2;
        while (pentDiff < smallestDiff) {
            while (smallestDiff < (pents.get(index) - pents.get(lowN))) {
                pents.remove(lowN);
                lowN++;
            }
            addPent();
            pentDiff = pents.get(index + 1) - pents.get(index);
            boolean found = false;
            long i = index - 1;
            while (!found && i >= lowN) {
                if (isPent(pents.get(index) + pents.get(i))) {
                    long diff = pents.get(index) - pents.get(i);
                    if (isPent(diff)) {
                        found = true;
                        if (diff < smallestDiff) {
                            nums[0] = pents.get(index);
                            nums[1] = pents.get(i);
                            smallestDiff = diff;
                        }
                    }
                }
                i--;
            }
            index++;
        }
        System.out.println(nums[0] - nums[1]);
    }
}
