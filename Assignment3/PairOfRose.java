import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PairOfRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // ArrayList<Integer> ele = new ArrayList<Integer>();
        int val = 0;
        int[] ans = new int[n * 5];
        for (int i = 0; i < n; i++) {
            int val2 = 0;
            int n3 = sc.nextInt();
            int[] arr3 = new int[n3];
            int[] min = new int[n3*2];
            for (int j = 0; j < n3; j++) {
                arr3[j] = sc.nextInt();
                // val = sc.nextInt();
                //  System.out.println(arr3[j]);
                // arr.add(val);
            }
            int value = sc.nextInt();
            Arrays.sort(arr3);
            for (int k =  0; k < arr3.length; k++) {
                int valu1 = arr3[k];
                // arr.add( arr3[k]);
                // System.out.print(ans[val] + "k");

                for (int j2 = k + 1; j2 < arr3.length; j2++) {
                     int valu2= arr3[j2];
                    // System.out.print(ans[val + 1] + "j");
                    if (valu1 + valu2 == value) {
                        min[val2] = valu1;
                        min[val2 + 1] = valu2;
                        //  System.out.println(
                        //          "Deepak should buy roses whose prices are " + min[val2] + " and " + min[val2 + 1]
                        //                  + ".");
                         val2 += 2;
                        
                        break;
                    }
                }
                
            }
            int minv = Integer.MAX_VALUE;
            int mini =0;
            int minj = 0;
            
            for (int k2 = 0; k2 <= val2-2; k2+=2) {
                // System.out.println(min[k2]+" mv "+min[k2 + 1]);
                if (minv>min[k2+1]-min[k2]) {
                    minv = min[k2+1]-min[k2];
                     mini = min[k2];
                     minj = min[k2+1];
                   
                }
            }
            ans[val] = mini;
            ans[val+1] = minj;
            val += 2;
        }
        for (int i = 0; i <= val-2; i += 2) {
            if (ans[i]<=ans[i + 1]) {
                
                System.out.println("Deepak should buy roses whose prices are " + ans[i] + " and " + ans[i + 1] + ".");
            }
        }
        
    }
    
}
