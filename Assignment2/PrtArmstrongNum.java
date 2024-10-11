
import java.util.Scanner;


public class PrtArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

       

        
    }   
    public static int[] PrtArmstrongNum(int n1, int n2){
        int count = 0;
        int tmp2 = 0;
        for (int i = n1; i < n2; i++) {
            int ans = 0;
            int tmp = i;
        while (tmp != 0 ) {
            tmp = tmp / 10;
            count ++;
        }
        tmp = i;
        while(tmp != 0)
        {
            tmp2 = tmp % 10;
            ans =ans + (int)Math.pow(tmp2, count);
            System.out.println(ans);
            tmp = tmp / 10;
           
        }
        int[i]
    }

    }
}
