import java.util.Scanner;
public class patternDoubleSided {
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int num = n/2+1;
        int num1 = 1;
        int sp1 = n/2;
        int sp2 = 1;
        for (int i = 1; i <= n; i ++)
        {
            int num2 = num1;
            for (int j = 1; j <= num; j++)
            {
                if (j <= sp1){
                    System.out.print("    ");
                }else {
                    System.out.print(num2+" ");
                    num2--;
                }
                
                
            }
            num2 = 1;
            for (int k = 1; k <= num*2-1;k++)
            {
                if ((sp2 > k) || i == 1 || i == n ) {
                    System.out.print("    ");
                    
                }
                else if (num1 >= num2)
                {
                    System.out.print(num2+" ");
                    num2++;
                }

            }
            if (n/2+1 > i)
            {

                sp1--;
                num1 ++;
                sp2++;
            }else
            {
                sp1++;
                num1--;
                sp2--;
            }
            System.out.println();
        }
    }
}
// if (num1 >= 0)