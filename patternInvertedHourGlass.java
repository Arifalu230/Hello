import java.util.Scanner;
public class patternInvertedHourGlass {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int fr = n;
        int lr = n+1;
        int num = 1;
        // int nb = n-1;
        int sp = n;


        for (int i = 1; i <= n*2-1; i++){
            int num1 = 1;
            for (int j = fr; j >= 0; j--){
                if( num1<= num){
                    System.out.print(j+" ");
                    num1++;
                }
                else{
                    if (j == 0  && num1 == n+1 ) 
                    System.out.print(j+" ");
                    else
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= lr-1; k++)
            {
                if (sp > k) {
                    System.out.print("  ");
                    
                }else
                {
                    System.out.print(k+" ");
                }

            }
            if (n > i)
            {

                num++;
                sp--;
            }else
            {
                sp++;
                num--;
            }
            // fr--;
            System.out.println();
        }
    }
}
