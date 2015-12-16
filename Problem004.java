import java.util.ArrayList;
/**
 * Finds the largest palindromic product of two three digit integers
 * @author Sean Titus
 * @version 1.0
 */
public class Problem4 {
    /**
     * Determines whether or not a String is a palindrome, not case sensitive
     * @param word The String being tested as a palindrome
     * @return A boolean of whether or not the input was a palindrome
     */
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        char[] wordArray = word.toCharArray();
        String reverse = "";
        for (int i = wordArray.length - 1; i >= 0; i--) {
            reverse += wordArray[i];
        }
        return reverse.equals(word);
    }
    /**
     * Main class, multiplies three digit ints and finds largest palindrome
     * @param args Command line arguments that aren't used
     */
    public static void main(String[] args) {
        ArrayList<Integer> palindromes = new ArrayList<Integer>();
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                int num = j * i;
                if (isPalindrome(Integer.toString(num))) {
                    palindromes.add(num);
                }
            }
        }
        int largest = 0;
        for (int i : palindromes) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
