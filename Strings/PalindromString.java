public class PalindromString {
    public static void main(String[] aergs) {
        String str = "Madam";

        String lowerStr = ToLoverCase(str);
        System.out.println(checkPalindrom(lowerStr));
    }

    public static String ToLoverCase(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ans += ch;
            } else if (ch > 'A' && ch <= 'Z') {
                char converted = (char) (ch - 'A' + 'a');
                ans += converted;
            } else {
                ans += ch;
            }

        }
        return ans;
    }

    public static boolean checkPalindrom(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        boolean flag = true;
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char stch = str.charAt(start);
            char endch = str.charAt(end);
            if (stch != endch) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;

    }

}
