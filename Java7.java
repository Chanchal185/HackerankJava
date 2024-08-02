import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java7 {
    public static void main(String[] args)  throws IOException {
        /*Java Loop1
        Input 2
        Output 2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        2 x 4 = 8
        2 x 5 = 10
        2 x 6 = 12
        2 x 7 = 14
        2 x 8 = 16
        2 x 9 = 18
        2 x 10 =20
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N <= 0){
            System.out.print("N must be a positive number");
        }
        else{ 
            for(int i=1; i<=10; i++){
                int result = N*i;
                System.out.println(N+" x "+ i +" = "+result);
            }
        }

        bufferedReader.close();
    }
}
