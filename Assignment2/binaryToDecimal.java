
import java.util.Scanner;

public class binarytoDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bintoDec(n));

    }

    public static int bintoDec(int num) {
        int lstdig = 0;
        int binval = 0;
        int pow = 0;

        while (num != 0) {
            lstdig = num % 10;
            binval = lstdig * (int) Math.pow(2, pow) + binval;
            pow++;
            num = num / 10;
        }
        return binval;

    }

}
