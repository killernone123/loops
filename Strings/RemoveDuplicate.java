public class RemoveDuplicate {
    // write a program to remove duplicate characters from string
    public static void main(String[] args) {
        String str = " aabbcdd";

        String ans = remove(str);

        System.out.println(ans);

    }

    public static String remove(String str) {
        if (str.length() == 0 || str.length() == 1)
            return str;
        String ans = "";
        ans += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (pre != curr) {
                ans += curr;
            }

        }
        return ans;
    }
}
