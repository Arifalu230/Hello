import java.util.Scanner;
public class SampleInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int ans = 0;
        int count = 0;

      for (int i = 0; i < arr.length; i++) {
      
          arr[i] = sc.nextInt();
          if (ans < 0) {
              arr[i] = sc.nextInt();
              break;
            }
            
            count = i;
            ans = ans + arr[i];
            count = i;
        }
        for (int j = 0; j <= count; j++) {
            System.out.println("array are"+arr[j]);

        }
    }
}