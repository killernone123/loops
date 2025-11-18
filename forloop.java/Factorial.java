public class Factorial {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a number and
        // then prints the factorial of that number using a loop

        int n = 5;
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        System.out.println(ans);

    }
}