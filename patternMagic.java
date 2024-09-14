import java.util.Scanner;
public class patternMagic {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int it = n*2-1;
        int st = n;
        int sp = 0;
        for (int i = 1; i <= it; i++)
        {
            for (int j = 1; j <= st; j++ )
            {
                System.out.print("*");
            }
            for (int k = 1; k < sp; k++)
            {
                System.out.print(" ");
            }
            for (int l = st; l > 0; l--)
            {
                if ( (i != 1 || l != 1) && (i != it || l != 1  ) ) {
                
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i>=n) {
                st++;
                sp-=2;
            }else{
                st--;
                sp+=2;

            }
        }
    }
}
