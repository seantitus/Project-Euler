public class Problem019 {
    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 1901;
        int day = 2;
        int sundays = 0;
        while (year <= 2000) {
            months[1] = year % 4 == 0 ? 29 : 28;
            for (int month : months) {
                for (int i = 1; i <= month; i++) {
                    if (i == 1 && day == 0) {
                        sundays++;
                    }
                    day = (day == 6) ? 0 : day + 1;
                }
            }
            year++;
        }
        System.out.println(sundays);
    }
}
