public class OddElement {public static void main(String[] args) {
        // write a java program to print odd elements in an array
        // int count =0;
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of even elements: " + count);
    }
}
