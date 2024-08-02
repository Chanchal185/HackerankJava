import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {
        /*
        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Check the conditions
        if (N % 2 == 1) {
            System.out.println("Weird"); // Odd numbers
        } else {
            // Even number checks
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
