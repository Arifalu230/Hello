
import java.util.Scanner;

public class ShopingGame {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int num = sc.nextInt();
        int ay[] = new int[num];
        int har[] = new int[num];
        for (int i = 0; i < num; i++) {
            ay[i] = sc.nextInt();
            har[i] = sc.nextInt();

        }
        for (int i = 0; i < num; i++) {
            int ayans = 0;
            int harans = 0;
            int ayval = ay[i];
            int harval = har[i];
            for (int j = 1; j <= ay[i] + har[i]; j++) {
                if (!(i % 2 == 0)) {
                    ayans = ayans + i;
                    if (ayans > ayval) {
                        System.out.println("Harshit");
                        break;
                    }
                } else {
                    harans = harans + i;
                    if (harval > harans) {
                        System.out.println("Aayush");
                        break;
                    }
                }

            }

        }
    }
}
