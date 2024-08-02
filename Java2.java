import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        //java Stdin and Stdout
        // input  42,100,125
        // output 42,100,125
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();  
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}
