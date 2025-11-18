import java.util.*;

public class PrintAllEnenNum {
    public static void main(String[] args) {
        /*
         * Write a program that asks the user to enter a number and then prints
         * all the even numbers from 0 to that number using a loop.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");

        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
