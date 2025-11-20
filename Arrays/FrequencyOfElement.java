public class FrequencyOfElement {
    public static void main(String[] args) {
        // write a java program to find the frequency of an elenment in an array
        int[] arr = { 2, 3, 1, 8, 1, 9, 0, 1, 7 };
        int ele = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count++;

            }
        }
        System.out.println(ele + " occurs " + count + " times in the array.");
    }
}
