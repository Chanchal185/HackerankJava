import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        // Java Stdin and Stdout 2
        // input 42 , 3.1415 , Welcome to HackerRank's Java tutorials! 
        // output  String: Welcome to HackerRank's Java tutorials! , Double: 3.1415 , Int: 42
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        sc.close();
    }
}
