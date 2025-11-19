

public class minimumArr {
    public static void main(String[] args){
        // how do you find the minimum element in an array in java?
        int[] arr = { 23, 45, 67, 89, 12, 90, 34 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (min > element) {
                min = element;

            }
        }
        System.out.println("Minimum element is: " + min);
    }

}
