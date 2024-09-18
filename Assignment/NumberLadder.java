import java.util.Scanner;
public class NumberLadder {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int st = 1;

        for(int i = 0;i < n;i++)
        {
            for (int j = 0;j < st;j++)
            {
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
            st++;


        }
    }
}
