/* Java String Introduction
Input 
hello
java
Output
9
No
Hello Java
 */



import java.util.Scanner;

public class Java14 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)<=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        // int a1 = A.length();
        // int b1 = B.length();
        // if(a1>=b1){
        //     System.out.println("No");
        // }
        // else{
        //     System.out.println("Yes");
        // }
        System.out.println((A.substring(0,1).toUpperCase()+A.substring(1))+ " " +(B.substring(0,1).toUpperCase()+B.substring(1)));
        sc.close();   
    }
}



