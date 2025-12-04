public class MissingNumber {
    public static void main(String[] args) {

        // write a programm to find the missimg number in a given range of integer
        // represented by an array.

        int[] arr = { 1, 3, 4, 5,6 };
        int arraySum = 0;

        int l = arr.length;
        int m = l + 1;

        for (int i = 0; i <l; i++) {
            arraySum += arr[i];

        }
        int expectedSum = (m * (m + 1)) / 2;

        int MissingNum = expectedSum - arraySum;
        System.out.println("Missing Number: " + MissingNum);

    }
}
