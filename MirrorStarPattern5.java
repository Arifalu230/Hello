import java.util.Scanner;
public class MirrorStarPattern5{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;


        for(int i = 0;i < n; i++)
        {
            for(int j = 0;j < sp;j++)
            {
                System.out.print("\t");

            }
            for(int k = 0;k < st;k++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if (n/2  <= i) {
                
                sp++;
                st -= 2;
            }else{
                sp--;
                st += 2;
                
            }
        }
    }
}