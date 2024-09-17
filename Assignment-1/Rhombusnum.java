import java.util.Scanner;
 class Rhombusnum {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ni = 1;
        int sp = n-1;
        int num = 1;

        for (int i = 0; i < n*2; i++ )
        {
            for(int j = 0; j < sp; j++)
            {
                System.out.print("\t");
            }
            for (int k = 0; k < ni; k++)
            {
                if (ni/2+1 <= k) {
                    num--;
                }else if (k > 0) {
                    
                    num++;
                } 
                System.out.print(num+"\t");
            }
            if (n-1 <= i) {
                sp++;
                ni -= 2;
                 num -= 1;
            }else{
                sp--;
                ni += 2;
                 num++;
            }
            System.out.println();
        }
    }
    
}
