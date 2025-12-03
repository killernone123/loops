public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6, 7 };

        int[] ans = new int[arr.length];
        ans[0] = arr[0];

        int idx = 1;

        int start = 0;
        int end = 1;

        while (end < arr.length) {

            if (arr[start] == arr[end]) {
                end++;
            } else {
                ans[idx] = arr[end];
                start = end;
                idx++;
                end++;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
