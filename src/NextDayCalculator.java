public class NextDayCalculator {

    public static final String JOIN_CHAR = "/";
    public static int lastDayOfMonth = 31;

    public static String nextDayCalculator(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                lastDayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
            case 2:
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    lastDayOfMonth = 29;
                } else lastDayOfMonth = 28;
                break;
            case 12:
                lastDayOfMonth = 31;
                month = 0;
                year++;
                break;
        }
        if (day == lastDayOfMonth) {
            day = 1;
            month++;
        } else day++;
        String targetResult = day + JOIN_CHAR + month + JOIN_CHAR + year;
        return targetResult;
    }
}
