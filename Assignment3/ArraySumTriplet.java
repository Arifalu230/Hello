import java.util.Arrays;
import java.util.Scanner;

public class ArraySumTriplet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int val = sc.nextInt();
        sum(arr, val);

    }

    public static void sum(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == val) {
                    System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    j++;
                } else if (arr[i] + arr[j] + arr[k] > val) {
                    k--;
                } else {
                    j++;
                }
            }
        }
    }
}
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length - 1; j++) {
// for (int j2 = j + 1; j2 < arr.length - 2; j2++) {
// if (arr[i] + arr[j] + arr[j2] == val) {
// System.out.println(arr[i] + ", " + arr[j] + " and " + arr[j2]);
// }
// // System.out.print(i + " " + j + " " + j2 + " ");
// }
// }

// }
// }