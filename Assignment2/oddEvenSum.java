package Assignment1.Assignment2;

import java.util.Scanner;

/**
 * oddEvenSum
 */
public class oddEvenSum {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rem;
    int odd = 0;
    int even = 0;
    for (int i = 1; n != 0; i++) 
    {
        rem = n % 10;
        n = n / 10;
        if (i % 2 == 0) {
            even = even + rem;
        }
        else 
        {
            odd = odd + rem;
        }
    }
    System.out.println(odd);
    System.out.println(even);
}
    
}