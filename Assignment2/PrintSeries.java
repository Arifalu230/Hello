import java.util.Scanner;
public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        prtser(n1, n2);
    }
    public static void prtser(int n1 , int n2){
        int n;
        int count = 0;
        int num = 1;
        
        while (count != n1) {
            n = 3*num + 2;
            if (n % n2 != 0) {
                System.out.println(n);
                count++;
            }
            num++;
            
    
        }
    }
}
