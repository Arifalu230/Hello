import java.util.Scanner;
public class sumArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Value");
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        sum = arr[0];
        for (int j = 1; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println(sum);

    }
    
}
