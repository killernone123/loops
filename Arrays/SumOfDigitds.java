
import java.util.Arrays;

public class SumOfDigitds {
    public static void main(String[] args) {
        int[] arr1 = { 9, 7, 3, 1, 2, 4, 5 };
        int[] arr2 = { 3, 1, 6, 7, 5, 3, 4, 9 };

        int l1 = arr1.length;
        int l2 = arr2.length;

        int resLength = 0;
        if (l1 > l2) {
            resLength = l1;
        } else {
            resLength = l2;
        }

        int[] res = new int[resLength];

        int p1 = l1 - 1;
        int p2 = l2 - 1;
        int p3 = resLength - 1;
        int carry = 0;

        while (p3 >= 0) {
            int ele1 = p1 >= 0 ? arr1[p1] : 0;
            int ele2 = p2 >= 0 ? arr2[p2] : 0;

            int sum = ele1 + ele2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            res[p3] = digit;

            p1--;
            p2--;
            p3--;
        }

        if (carry == 1) {
            int[] res2 = new int[resLength + 1];
            res2[0] = 1;
            for (int i = 0; i < res.length; i++) {
                res2[i + 1] = res[i];

            }
            res = res2;
        }

        //Space complexity= O(n)    
        //time complexity= O(n)
        System.out.println(Arrays.toString(res));
    }
}
