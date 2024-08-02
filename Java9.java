import java.util.Scanner;

public class Java9 {
    public static void main(String[] args) {
        /*
        Java End-of-file
        Input Hello world
        I am a file
        Read me until end-of-file.
        Output 1 Hello world
        2 I am a file
        3 Read me until end-of-file.
         */
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(i+ " " +str) ;
            i++;
        }
        sc.close();
    }
}
