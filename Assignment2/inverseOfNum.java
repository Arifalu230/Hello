import java.util.Scanner;
public class inverseOfNum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int [] a = new int[10];
        // int n = sc.nextInt();
        // int cn = 0;
        // int ln = 0;
        // int i = 1;
        // int tmp = n;
        // int ans = 0;
        // int tmp2 = n;
        // while(tmp != 0) {
        //     cn = tmp % 10;
        //     // while (tmp2 != 0) {
        //     //     // tmp2 = n;
        //     //     ln = tmp2 % 10;
        //     //     tmp2 = tmp2/10;
        //     //     System.out.println("tmp1"+tmp2);
        //     //     if (ln == i) {
        //     //         ans = tmp2 * 10 + cn;
        //     //         System.out.println("tmp2"+ans);
        //     //     }
                
        //     // }
        //     a[i] = cn;

        //     System.out.println(cn);
        //     tmp = tmp / 10;
        //     i++;

        // }
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int place=1;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+place * Math.pow(10, rem-1));
            System.out.println(sum);
			place++;
			n=n/10;
		}
		System.out.println(sum);
    }

      
    }

