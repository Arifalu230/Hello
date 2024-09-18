import java.util.Scanner;
public class HollowRumbus {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int st = n;

        for (int i = 0;i < n;i++)
        {
            for (int j = 0;j < sp;j++)
            {
                System.out.print(" ");
            }
            for (int k = 0;k < st;k++)
            {
                if (i == 0 || i == n-1) {
                    
                    System.out.print("*");
                }else if (k == 0 || k == st-1 )
                {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");

                }
            }
            sp--;
            System.out.println();

        }
    }
}
