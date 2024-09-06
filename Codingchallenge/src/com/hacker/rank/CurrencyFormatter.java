import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        // Reading input
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Formatting the payment for US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // Formatting the payment for Indian currency (custom locale)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // Formatting the payment for Chinese currency
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // Formatting the payment for French currency
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);

        // Output the formatted currency values
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
