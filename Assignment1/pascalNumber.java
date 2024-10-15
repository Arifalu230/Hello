import java.util.Scanner;
public class pascalNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sn = 1;
        int nm = 1;
        int tp =0;
        int ad =0;
        for (int i = 1; i <= n; i++){
            int cpn =0;
            int ptn1 = 1;
            int ptn2 = 1;
            int upn = 1;
            for (int j = 1; j <= nm; j++)
            {
                if (j==1 || j == nm) {
                    
                    System.out.print(1 +" ");
                    cpn =cpn*10+1;
                }else{
                    // cpn = ptn1/10;
                    ptn1 = tp %10;
                    tp = tp/10;
                    ptn2 = tp %10;
                    ad = ptn1+ptn2;
                    System.out.print(ad+" ");
                    cpn  =cpn*10+ad;


                    // System.out.print(" " +ptn1+ptn2+" "+upn);
                }
            }
            tp = cpn;
            System.out.println();
            nm ++;
        }
    }
    
}
