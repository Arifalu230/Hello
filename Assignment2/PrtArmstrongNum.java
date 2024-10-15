
import java.util.Scanner;


public class PrtArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr[] = new int[10];

        arr = PrtArmstrongNum(n1, n2);
        for (int i = 0; arr[i] != 0; i++) {
            
            System.out.println(arr[i]);
        }
       

        
    }   
    public static int[] PrtArmstrongNum(int n1, int n2){
        int arr[] = new int[n2 - n1];
        int countarr = 0;
        for (int i = n1; i < n2; i++) {
            int tmp2 = 0;
            int count = 0;
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
            tmp = tmp / 10;
            
        }
        if(ans == i)
        {
            // System.out.println(ans);
            arr[countarr] = ans;
            countarr++;

        }
    }
    return arr;

    }
}
