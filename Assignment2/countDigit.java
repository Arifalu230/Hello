import java.util.Scanner;
public class countDigit {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int repeat = valueReturn(num,digit);


    }
    public static int valueReturn(int num, int digit){
        // System.out.println(num+digit);
        // return num+digit;
        int n = num;
        int rem;
        int count = 0;
    // int even = 0;
    while(n != 0) 
    {
        rem = n % 10;
        n = n / 10;
        if (rem == digit) {
            count++;
        }
       
    // System.out.println(odd);
}
System.out.println(count);
    return count;
}
    
}
