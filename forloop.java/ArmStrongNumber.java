import java.util.*;

public class ArmStrongNumber {
    public static void main(String[] args) {

        // write a program that asks the user to enter a nmuber and prints
        // whether it is an armStrong number or not using a loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();
        int nCopy = n;
        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + (ld * ld * ld);
            int rem = n / 10;
            n = rem;
        }

        if (nCopy == sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}