import java.util.Scanner;

public class AlexGoesShoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] item = new int[n];
        for (int i = 0; i < n; i++) {
            item[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int val1 = 0;
        int val2 = 0;
        String[] ans = new String[val];
        for (int i = 0; i < val; i++) {
            val1 = sc.nextInt();
            val2 = sc.nextInt();
            int count = 0;
            for (int j = 0; j < item.length; j++) {
                if (val1 % item[j] == 0) {
                    // System.out.println(item[j]);
                    count++;
                }

            }
            System.out.println(count);
            if (val2 <= count) {
                ans[i] = "Yes";
            } else {
                ans[i] = "No";
                // System.out.println("No");
            }

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
