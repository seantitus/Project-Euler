import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem079 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("p079_keylog.txt"));
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNext()) {
            lines.add(sc.nextLine());
        }
        HashMap<Integer, HashSet<Integer>> after = new HashMap<Integer,
            HashSet<Integer>>();
        for (int i = 0; i < 10; i++) {
            after.put(i, new HashSet<Integer>());
        }
        for (String s : lines) {
            int one = Integer.parseInt(s.substring(0,1));
            int two = Integer.parseInt(s.substring(1,2));
            int three = Integer.parseInt(s.substring(2,3));
            after.get(one).add(two);
            after.get(one).add(three);
            after.get(two).add(three);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int s : after.get(i)) {
                System.out.print(s);
            }
            System.out.println("");
        }
        //Easy by inspection after this
    }
}
