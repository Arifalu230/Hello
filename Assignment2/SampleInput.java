import java.util.Scanner;
public class SampleInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int ans = 0;
        int count = 0;

      for (int i = 0; arr[i] == 0; i++) {
      
          arr[i] = sc.nextInt();
          ans = ans + arr[i];
          if (ans < 1000 || ans > -1000) {
            
              if (ans <= 0) {
                  break;
                }
                count = i;
          }
          else{
            arr[i] = 0;
          }
        }
        for (int j = 0; j < count; j++) {
            System.out.println("arr"+arr[j]);

        }
    }
}