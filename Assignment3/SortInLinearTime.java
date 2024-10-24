import java.util.Scanner;

public class SortInLinearTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count0 = 0;
        int count1 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count0) {
                arr[i] = 0;
            } else if (i < count0 + count1) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
            System.out.println(arr[i]);
        }
    }
}
