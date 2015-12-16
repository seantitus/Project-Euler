import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Problem022 {
    public static void main(String[] args) throws FileNotFoundException {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner fileScan = new Scanner(new File("p022_names.txt"));
        ArrayList<String> names = new ArrayList<String>();
        String fileString = "";
        while (fileScan.hasNext()) {
            fileString += fileScan.next();
        }
        for (String s : fileString.split(",")) {
            names.add(s.replace("\"",""));
        }
        Collections.sort(names);
        int totalScore = 0;
        for (int i = 0; i < names.size(); i++) {
            int score = 0;
            for (int j = 0; j < names.get(i).length(); j++) {
                score += 1 + letters.indexOf(names.get(i).substring(j, j + 1));
            }
            totalScore += score * (i + 1);
        }
        System.out.println(totalScore);
    }
}
