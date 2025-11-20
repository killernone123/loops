public class FirstAndLAstOccurence {
    public static void main(String[] args) {
        // how do you find the index of first and last occurence of an element in array
        // in java?
        int[] arr = { 2, 3, 1, 8, 1, 9, 0, 1, 7 };

        int ele = 1;

        int fo = -1;
        int lo = -1;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (flag == true && arr[i] == ele) {
                fo = i;
                lo = i;
                flag = false;
            } else if (arr[i] == ele) {
                lo = i;

            }
        }
        System.out.println("first occurence at index: " + fo);
        System.out.println("last occurence at index: " + lo);
    }

}
