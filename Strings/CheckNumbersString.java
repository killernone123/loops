public class CheckNumbersString {
    public static void main(String[] args) {
        String str = "134567";
        System.out.println(CheckNumbersString(str));
    }

    public static boolean CheckNumbersString(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(1);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
