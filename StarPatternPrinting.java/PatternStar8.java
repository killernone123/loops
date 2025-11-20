public class PatternStar8 {
    public static void main(String[] args) {
        int n = 7;
        int nsp = n / 2;
        int nst = 1;
        for (int i = 1; i <= n; i++) {// for rows
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {// for stars
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
        }
    }
}
 