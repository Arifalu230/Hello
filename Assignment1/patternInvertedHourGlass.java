import java.util.Scanner;
public class patternInvertedHourGlass {

    public static void main (String [] args)
    {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int rw = n*2+1;
        int cl = n*2+1;
        int num = 1;
        int sp = 1;
        for (int i = 1; i <= cl; i++){
            int spp = 1;
            for (int j = 1; j <=rw; j++){
                if (num >= j) {
                    System.out.print(n-j+1+" ");
                }
                else if(j <= rw-sp)
                {
                    System.out.print("  ");
                }
                else 
                {
                    System.out.print(j-n-1+" ");
                    spp++;
                }
            }
            if (n>=i) 
            {
                sp ++;
                num++;
            }
            else
            {
                num--;
                sp --;
            }
            System.out.println();
        }
    }
}
