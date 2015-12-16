import java.math.BigDecimal;
public class Problem16 {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(2);
        num = num.pow(1000);
        String numString = num.toPlainString();
        int total = 0;
        for (String s : numString.split("")) {
            total += Integer.parseInt(s.trim());
        }
        System.out.println(total);
    }
}
