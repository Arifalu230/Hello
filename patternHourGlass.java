import java.util.Scanner;
public class patternHourGlass {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 1;
        int nm = n*2+1;
        int rw = n;
        for (int i = 0; i <= n*2; i++)
        {
            int cl = 1;
            int pv = rw;

            for (int j = 1; j < sp; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= nm; k++)
            {
                if(pv >= 0)
                {
                    System.out.print(pv+" ");
                    pv--;
                }
                else
                {
                    System.out.print(cl+" ");
                    cl++;
                }
            }
            if (n>i) {

                sp++;
                nm-=2;
                rw--;
            }
            else
            {
                sp--;
                nm += 2;
                rw++;
            }
            System.out.println();
        }
        
    
    }
    
}
