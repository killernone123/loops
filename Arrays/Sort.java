import java.util.*;

public class Sort {
    // how do you sort an array in java?
    public static void main(String[] args) {
        int[] arr = { 1, 3443, 54, 32, 4 };

        Arrays.sort(arr);
        //we will learn in upcoming lectures 
        //bubble sort, selection sort, insertion sort, merge sort, quick sort

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
