public class CoppyArr {
    public static void main(String[] args) {
        // coppy of array in java
        int[] arr = { 1, 2, 3, 4, 3, 7 };
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
