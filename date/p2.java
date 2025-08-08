import java.time.Month;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Months and number of days (Non-leap year):");
        for (Month month : Month.values()) {
            System.out.println(month + " - " + month.length(false) + " days");
        }
    }
}
