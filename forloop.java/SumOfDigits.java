import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {

        // write a program that ask the user to enter a
        // number and then prints the sum of the digits.

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int n = sc.nextInt();

        int i = 1;
        int Sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            Sum += lastDigit;
            int remmNumber = n / 10;
            n = remmNumber;

        }
        System.out.println(Sum);

    }
}