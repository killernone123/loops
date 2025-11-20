public class FindIndex {
    // how do you find index of an element in array in java?
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 9 };

        int element = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index: " + i);
            }
        }
    }
}
