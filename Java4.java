
import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        // Input java 100
        // cpp 65
        // python 50
        // Output ==========================
        // java 100
        // cpp 065
        // python 050
        // ======================//
       System.out.println("================================");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}


