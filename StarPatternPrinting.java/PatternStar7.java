
public class PatternStar7 {

    public static void main(String[] args) {
        int n = 9;
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= (2 * n - 1); i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                nsp--;
                nst++;
            } else {
                nsp++;
                nst--;
            }
        }
    }
}
