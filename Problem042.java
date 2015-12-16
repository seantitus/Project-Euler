import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem042 {
    private static String letters;
    private static ArrayList<Integer> triangles;
    private static boolean isTriangle(String s) {
        int total = 0;
        for (String letter : s.split("")) {
            total += letters.indexOf(letter) + 1;
        }
        return triangles.contains(total);
    }
    public static void main(String[] args) throws FileNotFoundException {
        letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        triangles = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            triangles.add((i + 1) * (i + 2) / 2);
        }
        int total = 0;
        Scanner fileScan = new Scanner(new File("p042_words.txt"));
        while (fileScan.hasNext()) {
            for (String s : fileScan.next().split(",")) {
                total += (isTriangle(s.replace("\"", ""))) ? 1 : 0;
            }
        }
        System.out.println(total);
    }
}
