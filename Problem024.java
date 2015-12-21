import java.util.ArrayList;
import java.util.Collections;
public class Problem024 {
    private static ArrayList<String> permute(String s) {
        ArrayList<String> perms = new ArrayList<String>();
        if (s.length() == 1) {
            perms.add(s);
            return perms;
        }
        ArrayList<String> deeper = permute(s.substring(1));
        String head = s.substring(0,1);
        for (String str : deeper) {
            for (int i = 0; i <= str.length(); i++) {
                perms.add(str.substring(0, i) + head + str.substring(i));
            }
        }
        return perms;
    }
    public static void main(String[] args) {
        ArrayList<String> perms = permute("0123456789");
        Collections.sort(perms);
        System.out.println(perms.get(999999));
    }
}
