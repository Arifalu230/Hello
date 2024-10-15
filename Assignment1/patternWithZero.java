import java.util.Scanner;
public class patternWithZero {
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int ni = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= ni; j++)
            {
                if (j == 1 || j == ni) {
                    System.out.print(i+"\t");
                    
                }
                else
                {
                    System.out.print(0+"\t");
                }

            }
            System.out.println();
            ni++;
        }
    }
    
}
