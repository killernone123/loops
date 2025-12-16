public class SecondMostFrequentCharacer {
    public static void main(String[] args) {
        // Write a Java program to find the second most frequent alphabet in a string.
        String str = "aaAbcbaaafgtKmbgdJK dejgejssssDdtyiIknjbIvxsjzKiond bdvjh  sjhwsweaaAaaFDaasssssss";

        findSecond(str);

        // TimeComplexity - O(n)
        // SpaceComplexity - O(1)

    }

    public static void findSecond(String str) {
        if (str.length() == 0) {
            return;
        }
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = covertToLowerCase(ch);
            }
            if (ch >= 'a' && ch <= 'z') {
                int charIdx = ch - 'a'; // 's'-'a'= 115-97 = 18
                arr[charIdx] = arr[charIdx] + 1;
            }
        }
        int[] ans = findSecondMaxAndSecondMaxIndex(arr);
        int frequency = ans[0];
        char secondMostFrequentChar = (char) (ans[1] + 'a');
        System.out.println(
                "Second Most frequent Character is " +
                        secondMostFrequentChar + " beacuse it comes " +
                        frequency + " times");
    }

    public static char covertToLowerCase(char ch) {
        return (char) (ch - 'A' + 'a');
    }

    public static int[] findSecondMaxAndSecondMaxIndex(int[] arr) {
        int max = 0;
        int smax = 0;
        int maxIdx = 0;
        int smaxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                smaxIdx = maxIdx;
                max = arr[i];
                maxIdx = i;
            } else if (smax < arr[i]) {
                smax = arr[i];
                smaxIdx = i;
            }
        }
        int[] ans = { smax, smaxIdx };
        return ans;
    }
}
