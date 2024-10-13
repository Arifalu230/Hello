
import java.util.Scanner;

public class ConAnyToAny {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ctb = sc.nextInt();
        int cnb = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(conversion(ctb, cnb, n));
    }

    public static int conversion(int ctb, int cnb, int n) {
        // int n = sc.nextInt();
        int ans = 0;
        int ans2 = 0;
        int rem = 1;
        int count = 0;
        while (n != 0) {
            rem = n % 10;
            ans = ans + (int) Math.pow(ctb, count) * rem;
            count++;
            n = n / 10;
        }
        rem = 0;
        while (ans != 0) {
            rem = ans % cnb;
            ans2 = ans2 * 10 + rem;
            ans = ans / cnb;
            System.out.println(rem);

        }
        // ans2 = ans * 10 + rem;
        // System.out.println(ans2);
        return ans2;
    }

}
