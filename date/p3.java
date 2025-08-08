import java.time.MonthDay;

public class p3 {
    public static void main(String[] args) {
        MonthDay today = MonthDay.now();
        MonthDay independenceDay = MonthDay.of(8, 15); // 15th August

        if (today.equals(independenceDay)) {
            System.out.println("Today is Independence Day!");
        } else if (today.isBefore(independenceDay)) {
            System.out.println("Independence day is yet to come this year.");
        } else {
            System.out.println("Independence day was already celebrated this year.");
        }
    }
}
