import java.util.Scanner;

public class Java10 {

    public static void main(String[] args) {
        /*Java Static Initializer Block
        Input 1
        3
        Output 
        3
        Input 
        -1
        2
        Output
        Java. lang.Exception : Breadth height must be positive.
         */
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
          int Area = B*H;
            System.out.println(Area);
        }
        sc.close();
    }
}
