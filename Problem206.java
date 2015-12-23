public class Problem206 {
    private static boolean isForm(String s) {
        boolean form = true;
        for (int i = 0; i < 9; i++) {
            form = form && String.valueOf(i + 1).equals(
                s.substring(2 * i, 2 * i + 1));
        }
        form = form && s.substring(18).equals("0");
        return form;
    }
        
    public static void main(String[] args) {
        long low = (long) Math.ceil(Math.sqrt(1020304050607080900L));
        long high = (long) Math.floor(Math.sqrt(1929394959697989990L));
        boolean found = false;
        while(!found && low < high) {
            found = isForm(String.valueOf(low * low));
            if (found) {
                System.out.println(low);
            }
            low++;
        }
    }
}
