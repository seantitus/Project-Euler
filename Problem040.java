import java.util.ArrayList;
import java.util.Arrays;
public class Problem040 {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>(1000000);
        int i = 1;
        while (nums.size() <= 1000000) {
            nums.addAll(Arrays.asList(String.valueOf(i).split("")));
            i++;
            if (i % 1000 == 0) {
                System.out.println(nums.size());
            }
        }
        int total = Integer.parseInt(nums.get(0));
        total *= Integer.parseInt(nums.get(9));
        total *= Integer.parseInt(nums.get(99));
        total *= Integer.parseInt(nums.get(999));
        total *= Integer.parseInt(nums.get(9999));
        total *= Integer.parseInt(nums.get(99999));
        total *= Integer.parseInt(nums.get(999999));
        System.out.println(total);
    }
}
