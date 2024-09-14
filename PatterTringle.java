import java.util.Scanner;
class PatterTringle{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int num = 1;
        int ns = 1;
       for(int i = 0;i < n; i++){

        for(int j = 0; j < sp;j++){
            System.out.print("\t");

        }
        for (int k = 0; k < ns;k++){
            if (ns/2+1 <= k) {
                --num;

                
            }else if(k != 0){
                ++num;
            }
            System.out.print(num+"\t");

        }
        ns += 2;
        sp--;
        ++num;
        // if (ns+ns > n) {
        //     num--;
        // }else{}
        System.out.println();
       }

    }
}