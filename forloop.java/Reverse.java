
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        // Write a program that takes a number from
        // user and prints its reverse

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number for reverce :");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum * 10 + lastDigit;
            int remmNumber = n / 10;
            n = remmNumber;

        }
        System.out.println(sum);

    }
}
