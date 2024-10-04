import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));
        
    }
    public static int gcd(int n1, int n2){
        int rem = 0;
        while (!(n2 % n1 == 0)) {
            rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }
        // rem = n2 % n1;
        return rem;
    }
    
}

// System.out.println(rem);