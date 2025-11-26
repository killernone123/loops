public class SecondMin {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 6, 56, 89, 50, 34 };

        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele < min) {
                secondmin = min;
                min = ele;
            } else if (ele < secondmin && ele != min) {
                secondmin = ele;
            }
        }
        System.out.println("Second minimum element is: " + secondmin);
    }
}
