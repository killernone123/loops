
public class Basics {
    public static void main(String[] args) {
        // declation
        int[] arr = { 1, 2, 3, 4, 5 };

        // initialization
        int[] arr2 = new int[4];

        // accessan element inarray
        // System.out.println(arr[3]);

        // change a elment of array
        arr[2] = 999;

        // length of array
        // System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}