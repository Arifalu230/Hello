
import java.util.Scanner;

public class BostonNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bostonNum(n));

    }

    public static int bostonNum(int n) {
        int mdnum = 2;
        int ans = 0;
        int tmp = n;
        int rem = 0;
        int ans2 = 0;
        if (n <= 2) {
            return 0;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (i % n == 0) {
                break;
            } else if (i == n / 2) {
                System.out.println("prime");
                return 0;
            }
        }

        while (tmp != 1) {
            if (tmp % mdnum == 0) {
                ans = ans + mdnum;
                tmp = tmp / mdnum;
            } else {
                mdnum++;
            }
        }
// System.out.println(ans);
        while (n != 0) {
            rem = n % 10;
            ans2 = ans2 + rem;
            n = n / 10;
            // System.out.println(ans2);
        }
        if (ans == ans2) {
            return 1;
        }
        return 0;
    }
}
