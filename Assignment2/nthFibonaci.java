import java.util.Scanner;
public class nthFibonaci {

       public static void main (String [] args)
       {
              Scanner sc =  new Scanner(System.in);
              int n = sc.nextInt();
              System.out.println(fib(n));
       }
       public static int fib(int n){
              int temp = 0;
              int start = 1;
              int ans = 0;
              for (int i = 1; i < n; i++)
              {
                    ans = temp + start;
                    temp = start; 
                    start = ans;
              }
              return ans;

       }
       
}
