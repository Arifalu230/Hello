import java.util.Scanner;
public class primeNumber {
    public static void main (String [] args){
        Scanner  sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                System.out.println("This num is not prime Num :-- "+n);
                return;
            }
            else if (i == n-1) {
                System.out.println("This num is Prime no :-- "+n);
                return;
            }
        }
    }
    
}
