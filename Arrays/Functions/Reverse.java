public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 45 };

        Reverseself(arr);
        // int[] res2 = reverse(arr);
        System.err.println(java.util.Arrays.toString(arr));
      

    }

    public static void Reverseself(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int k = arr[st];
            arr[st] = arr[end];
            arr[end] = k;
            st++;
            end--;
        }
    }

    public static int[] reverse(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        int[] res = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[idx] = arr[i];
            idx++;
        }
        return res;
    }

}
