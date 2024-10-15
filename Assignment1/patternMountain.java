import java.util.Scanner;
public class patternMountain {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int sp = 5;
        int ni = n*2-1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= num; j++ )
            {
                System.out.print(j +"\t");
            }
            for (int k = 1; k<= sp; k++)
            {
                System.out.print("\t");
            }
            for (int l = num; l > 0; l--)
            {
                if (i != n || l != n ) {
                    System.out.print(l+"\t");
                    
                }else{
                    
                }
            }
            num ++;
            sp -= 2;
            System.out.println();

        }
    }
    
}
