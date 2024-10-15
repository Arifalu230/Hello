
import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayMaxVal max = new ArrayMaxVal();
        int n = sc.nextInt();
        int[] arr = max.addArray(n, sc);

        System.out.println(max.maxValueArray(arr));
    }

}

class ArrayMaxVal {

    int maxValueArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    int[] addArray(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
