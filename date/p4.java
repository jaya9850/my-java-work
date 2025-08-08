import java.text.NumberFormat;
import java.util.Locale;

public class LocaleFormatExample {
    public static void main(String[] args) {
        double number = 123456.78;

        NumberFormat italianFormat = NumberFormat.getInstance(Locale.ITALIAN);
        System.out.println("Italian formatted number: " + italianFormat.format(number));

        NumberFormat koreanCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.println("Korean currency format: " + koreanCurrencyFormat.format(number));
    }
}
