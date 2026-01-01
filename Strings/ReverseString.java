public class ReverseString {
    public static void main(String[] args) {
        // Write a java program to reverse a string.
 String str = "Hello I himself";

        String ans = reverse(str);

        System.out.println(ans);

    }

    public static String reverse(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }

        // TimeComlexity = O(n)
        // SpaceComplexity = O(n)

        return sb.toString();
    }
}
