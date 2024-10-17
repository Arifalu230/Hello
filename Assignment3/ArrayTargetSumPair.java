import java.util.Arrays;
import java.util.Scanner;

public class ArrayTargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int value = sc.nextInt();
         Arrays.sort(arr);
        sumFind(arr, value);
    }

    public static void sumFind(int[] arr, int value) {
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            if (arr[i] + arr[j] == value) {
                System.out.println(arr[i]+" and "+arr[j]);
                j--;

            } else if (arr[i] + arr[j] > value) {
                j--;
            } else {
                i++;
            }
            
        }
    }
}
