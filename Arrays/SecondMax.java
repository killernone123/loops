public class SecondMax {
    public static void main(String[] args) {
        // how do you find the second maximum element in an array in java?
        int[] arr = { 2, 4, 3, 6, 56, 89, 50, 34 };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele > max) {
                secondMax = max;
                max = ele;
            } else if (ele > secondMax && ele != max) {
                secondMax = ele;
            }
        }
        System.out.println("Second maximum element is: " + secondMax);
    }
}
