
import java.util.Scanner;

public class ChewbaccaNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(ChewbaccaNum(n));
    }

    public static long ChewbaccaNum(long n) {
        long rem = 0;
        long ans = 0;
        for (long i = 0; n != 0; i++) {
            rem = n % 10;
            if (n == 9) {
                ans = (rem) * ((long) Math.pow(10, i)) + ans;
            } else if (9 - rem < rem) {
                ans = ((9 - rem) * ((long) Math.pow(10, i)) + ans);
            } else {
                ans = (rem) * ((long) Math.pow(10, i)) + ans;
            }
            n = n / 10;
        }
        return (long) ans;
    }

}
