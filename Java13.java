/*INput 
12324.134
Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
 */



import java.util.*;
import java.text.NumberFormat;


public class Java13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
    

    
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        String china = cnFormat.format(payment);
        String france = frFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: "+ india);
        System.out.println("China: "  + china);
        System.out.println("France: " + france );
        scanner.close();
    }
}
