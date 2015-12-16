import java.math.BigInteger;
public class Problem25 {
    public static void main(String[] args) {
        BigInteger old = BigInteger.valueOf(1);
        BigInteger current = BigInteger.valueOf(1);
        int index = 2;
        boolean found = false;
        while (!found) {
            index++;
            BigInteger temp = current;
            current = current.add(old);
            old = temp;
            if (current.toString().length() == 1000) {
                found = true;
            }
        }
        System.out.println(index);
    }
}
