
public class PatternStar6 {

    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        for (int i = 1; i <= (2 * n - 1); i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                nst++;
            } else {
                nst--;
            }
        }
    }
}
