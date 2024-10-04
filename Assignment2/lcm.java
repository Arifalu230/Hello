import java.util.Scanner;
public class lcm {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = sc.nextInt();
    System.out.println(Lcm(n, n1));
    }
public static int Lcm(int num , int num1){
    int ans = 1;
    int dval = 2;
    int i = dval;
    while (num1 > 1 || num > 1 ) {
        int val = 0;
        if (num % dval == 0 ){
            num = num / dval;
            val = 1;

        }
        if ( num1 % dval == 0) {

            num1 = num1 / dval;
            // ans = dval * ans;
            val = 1;
            
        }else 
        {
            dval++;
            

        }
        System.out.println("val "+num+" "+num1 + " "+ dval);
        if (val == 1) {
            ans = i * ans;
            
        }
            System.out.println(ans + " " + i);
            i = dval;
        
    }

    return ans;


}
}
