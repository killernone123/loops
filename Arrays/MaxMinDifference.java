public class MaxMinDifference {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9,0, 1, 5, 6 };
        int max = arr[0];
        int min = arr[0];

        for(int i =0; i<arr.length; i++){
            int ele = arr[i];
            if(max < ele){
                max = ele;
            }
            if(min > ele){
                min = ele;
            }
        }
        int difference = max - min;
        System.out.println("Difference between max and min: " + difference);
    }
}
