public class MaximumArr {
    public static void main(String[] args) {
        // how do you find ythe amximum element in an array in java?
        int[] arr = { 23, 45, 67, 89, 12, 90, 34 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (max < element) {
                max = element;

            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
