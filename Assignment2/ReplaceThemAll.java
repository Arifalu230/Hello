import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
          long n =  sc.nextLong();
          if (n>0) {
              System.out.println(replace(n));
          }
    }
    public static long replace(long n){
        long rem =  0;
        long ans = 0;
        for (long i = 0; n != 0; i++) {
            rem = n % 10;
            if (rem == 0) {
                ans  = (( 5)*( (long)Math.pow(10, i)) + ans);
            }else {
            ans = (rem)*( (long)Math.pow(10, i)) + ans;
            }
            n = n / 10;
        }
        return ans;
    }
}
