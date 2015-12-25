public class Problem033 {
    public static void main(String[] args) {
        for (int den = 11; den < 100; den++) {
            for (int num = 10; num < den; num++) {
                String nStr = String.valueOf(num);
                String dStr = String.valueOf(den);
                if (nStr.substring(0,1).equals(dStr.substring(0,1)) &&
                    Double.parseDouble(nStr.substring(1,2)) / 
                    Double.parseDouble(dStr.substring(1,2)) == 
                    ((double) num ) / den) {
                    System.out.println(num + "/" + den);
                }
                if (nStr.substring(1,2).equals(dStr.substring(0,1)) &&
                    Double.parseDouble(nStr.substring(0,1)) / 
                    Double.parseDouble(dStr.substring(1,2)) == 
                    ((double) num ) / den) {
                    System.out.println(num + "/" + den);
                }
                if (nStr.substring(0,1).equals(dStr.substring(1,2)) &&
                    Double.parseDouble(nStr.substring(1,2)) / 
                    Double.parseDouble(dStr.substring(0,1)) == 
                    ((double) num ) / den) {
                    System.out.println(num + "/" + den);
                }
                if (nStr.substring(1,2).equals(dStr.substring(1,2)) &&
                    Double.parseDouble(nStr.substring(0,1)) / 
                    Double.parseDouble(dStr.substring(0,1)) == 
                    ((double) num ) / den) {
                    System.out.println(num + "/" + den);
                }
            }
        } //Easier to just do it manually from here
    }
}
