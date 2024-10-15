
import java.util.Scanner;

public class ArrayTargetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = addArray(n, sc);
        sort(arr);
        sumPair(arr);
        // ptrArray(arr);

    }

    public static int[] addArray(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void sumPair(int[] arr) {
        int val1;
        int val2;

        for (int i = 0; i < arr.length; i++) {
            val1 = arr[i];
            for (int j = i; j < arr.length; j++) {
                val2 = arr[j];
                while (val1 + val2 == 5) {
                    System.out.println(val1 + " and " + val2);
                    break;
                }
            }
        }

    }

    public static void sort(int[] arr) {
        int tmp = 0;
        int maxa = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    maxa = j;

                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[maxa] = tmp;
            // System.out.println("min" + min);

        }
    }

}
