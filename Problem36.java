public class Problem36 {
    private static String getPalindrome(String s) {
        String palindrome = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            palindrome += s.substring(i, i + 1);
        }
        return palindrome;
    }
    private static String stripZeros(String s) {
        while (s.indexOf("0") == 0) {
            s = s.substring(1);
        }
        return s;
    }
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000000; i++) {
            if (i == Integer.parseInt(getPalindrome(String.valueOf(i)))) {
                String binary = Integer.toBinaryString(i);
                if (binary.equals(stripZeros(getPalindrome(binary)))) {
                    total += i;
                }
            }
        }
        System.out.println(total);
    }
}
