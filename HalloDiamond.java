import java.util.Scanner;
class HalloDiamond{
    public static void main(String[] args){
        // System.out.print("Hello World ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int st = n/2+1;
        int sp = -1 ;

        for (int k = 1; k <= n; k++) {
            int l = 1;
        
        for (int i = 1; i <= st; i++) {
            System.out.print("* ");
            
        }
        for(int j = 1; j <= sp; j++){
            System.out.print("  ");;
        }if (k == 1 || k == n) {
            l = 2;
        }
        for (; l <= st; l++){
                System.out.print("* ");
                
            

        }
    

        // }
        if (n/2+1 > k){
            sp +=2;
            st--;

            // System.out.print("g");
        }
        else{
            sp -=2;
            st ++;
            // System.out.print("s");
        }
        System.out.println();
    }
    }
    }
