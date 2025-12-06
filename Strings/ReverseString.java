public class ReverseString {
    public static void main(String[] args) {
        // Write a java program to reverse a string.
        String str = "HelloWorld";

        String ans = reverse(str);
        System.out.println(ans);

    }

    public static String reverse(String str) {
        if(str.length() ==0 || str.length() ==1){
            return str;
        }
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            ans = ans + ch;
        }
        //timre complexity is O(n)
        //space complexity is O(n)

        return ans;
    }
}
