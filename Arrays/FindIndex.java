public class FindIndex {
    // how do you find index of an element in array in java?
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 9 };

        boolean flag = true;// e are assume that arry are sorted

        for (int i = 1; i < arr.length; i++) {
            int currentEle = arr[i];
            int preEle = arr[i - 1];

            if (preEle > currentEle) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
