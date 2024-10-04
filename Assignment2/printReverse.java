import java.util.Scanner;
class printReverse{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println( Reverse(n));
    }
    public static int Reverse(int num){
        int rev = 0;
        while (num != 0)
        {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }
}