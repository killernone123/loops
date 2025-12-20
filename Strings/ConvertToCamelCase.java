public class ConvertToCamelCase {
    public static void main(String[] args) {
        String str = "piyush phoolmali";
        System.out.println(ConvertToCamelCase(str));
    }

    public  static String  ConvertToCamelCase(String str) {
        String ans = "";

        str = str.trim();//Remove start end spaces

        char fc = str.charAt(0);

        if(fc >='a' && fc<='z'){
            fc = (char)(fc - 'a' +'A');
        }
        ans += fc;

        for(int i= 1; i<str.length(); i++){
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);
            if(curr == ' '){
            continue;
            }else if(pre == ' ' && curr >= 'a' && curr <= 'z'){
                curr = (char)(curr-'a'+'A');
            }
            ans += curr;

        }
    



        return ans;
    }
}
