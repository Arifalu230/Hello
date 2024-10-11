
import java.util.Scanner;

public class OddEvenBAckInDelhi {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int arrM[] = new int[num];
        int arrn[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
          int tmp = arr[i];
          int rem = 0; 
            while (tmp != 0) {
                rem = tmp%10;
                if (rem%2 == 0) {
                    arrM[i] = arrM[i] + rem;
                }
                else 
                {
                    arrn[i] = arrn[i] + rem;
                }
                tmp = tmp / 10;
            }
        }
        for (int j = 0; j < num; j++) {
            
            if(arrM[j] % 4 == 0 || arrn[j] % 3 == 0){
                System.out.println("Yes");
            }
            else 
            {
                System.out.println("No");
            }
        }

    }
}
