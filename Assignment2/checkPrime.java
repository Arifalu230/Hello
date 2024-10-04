import java.util.Scanner;

public class checkPrime {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            // if (n<2) {
            //     System.out.println("Prime");
                
            // }
            // int n2 = sc.nextInt();
            // int p = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                break;
            }else if (i == n) {
                System.out.println("Prime");
                break;
            }
           
        }
        // if (p == 1) {
            
        //     System.out.println("Not Prime");
        // }else{
        //     System.out.println("Prime");
            
        // }

    }
}
    
