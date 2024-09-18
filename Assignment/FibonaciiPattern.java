import java.util.Scanner;
public class FibonaciiPattern {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ni = 1;
        int tem = 0;
        int num = 1;
        int sol = 0;
        // System.out.println(num+"\t");
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= ni; j++)
            {
           
                System.out.print(sol+"\t ");
                tem = num;
                num = sol;
                sol = tem + num; 
            }
            System.out.println();
            ni++;
        }
    }
}
