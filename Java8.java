import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        /*Input 
        2
        0 2 10
        5 3 5
        Output
        2 6 14 30 62 126 254 510 1022 2046
        8 14 26 50 98
         */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1; j<=n; j++){
                a=a+b;
                System.out.print(a+" ");
                b=b*2;
            }  
            System.out.println("");
        }
        
        in.close();
    }
}
