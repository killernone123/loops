public class concatenateArr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 4, 5 };
        int[] arr2 = { 23, 4, 5, 6 };

        int length1 = arr.length;
        int length2 = arr2.length;

        int[] res = new int[length1 + length2];
        for (int i = 0; i < res.length; i++) {

            if (i < length1) {
                res[i] = arr[i];
            } else {
                res[i] = arr2[i - length1];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "   ");
        }
    }
}
