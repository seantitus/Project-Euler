public class Problem017 {
    public static void main(String[] args) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety"};
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String num = ones[i];
                    num += (i == 0) ? "" : "hundred";
                    num += (i == 0 || (j == 0 && k == 0)) ? "" : "and";
                    if (j == 1) {
                        num += teens[k];
                    } else {
                        num += tens[j] + ones[k];
                    }
                    total += num.length();
                }
            }
        }
        total += "onethousand".length();
        System.out.println(total);
    }
}
