import java.util.Scanner;

public class MaximumSumPathInTwoArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1;
        int[] arr2;
        int[] ansarr = new int[size];
        for (int i = 0; i < size; i++) {
            int asize = sc.nextInt();
            int bsize = sc.nextInt();
            arr1 = new int[asize];
            arr2 = new int[bsize];
            for (int j = 0; j < asize; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j < bsize; j++) {
                arr2[j] = sc.nextInt();
            }
            ansarr[i] = sumPathArray(arr1, arr2);

        }
        for (int i = 0; i < ansarr.length; i++) {
            System.out.println(ansarr[i]);
        }

        // System.out.println(arr1.length);

    }

    public static int sumPathArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int sum1 = arr1[0];
        int sum2 = arr2[0];
        int ans = 0;
        while (arr1.length - 1 > i || arr2.length - 1 > j) {
            // System.out.println(arr2[j]);
            // j++;
            if (arr1[i] == arr2[j]) {
                if (sum1 < sum2) {
                    ans = ans + sum2;
                } else {

                    ans = ans + sum1;
                }
                i++;
                sum1 = arr1[i];
                j++;
                sum2 = arr2[j];
            } else if (arr1[i] < arr2[j]) {
                if (arr1.length - 1 > i) {

                    i++;
                    sum1 = sum1 + arr1[i];
                } else {
                    j++;
                    sum2 = sum2 + arr2[j];
                }

            } else {
                if (arr2.length - 1 > j) {

                    j++;
                    sum2 = sum2 + arr2[j];
                } else {
                    i++;
                    sum1 = sum1 + arr1[i];
                }

            }

            // System.out.println(ans);

        }
        // System.out.print("sum1 " + sum1 + " sum2 " + sum2);
        if (sum1 < sum2) {
            ans = ans + sum2;
        } else {

            ans = ans + sum1;
        }
        return ans;
        // System.out.println(ans);

    }

}
