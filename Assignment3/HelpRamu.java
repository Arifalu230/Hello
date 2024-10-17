import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] ans = new int[testCase * 3];
        int val = 0;
        for (int i = 0; i < testCase; i++) {
            int[] ticket = new int[4];
            for (int j = 0; j < 4; j++) {
                ticket[j] = sc.nextInt();
                // System.out.println();
            }
            int rik = sc.nextInt();
            int cab = sc.nextInt();
            int[] rikval = new int[rik];
            int[] cabval = new int[cab];
            for (int j = 0; j < rikval.length; j++) {
                rikval[j] = sc.nextInt();
            }
            for (int j = 0; j < cabval.length; j++) {
                cabval[j] = sc.nextInt();
            }
            int minvalrik = 0;
            for (int j = 0; j < rik; j++) {
                minvalrik = minvalrik + (int) Math.min(rikval[j] * ticket[0], ticket[1]);
                System.out.println(minvalrik);
            }
            minvalrik = (int) Math.min(minvalrik, ticket[2]);
            int minvalcab = 0;
            for (int j = 0; j < cab; j++) {
                minvalcab = minvalcab + (int) Math.min(cabval[j] * ticket[0], ticket[1]);
            }
            minvalcab = (int) Math.min(minvalcab, ticket[2]);
            ans[val] = (int) Math.min(minvalrik + minvalcab, ticket[3]);
            val++;

        }
        for (int i = 0; i < val; i++) {
            System.out.println(ans[i]);
        }
    }
    
}
