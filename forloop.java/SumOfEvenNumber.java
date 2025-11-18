public class SumOfEvenNumber {
    public static void main(String[] args) {
        // Write a program that prints the sum of all
        // the even numbers from 1 to 100 using a loop.

        int count = 0;

        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // count = count + i;
        // }
        // }

        for (int i = 0; i <= 100; i += 2) {
            count = count + i;
        }

        System.out.println(count);

    }
}