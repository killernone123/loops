public class Pattern15 {

    public static void main(String[] args) {
        int n = 121;
        int nsp = 0;
        int nst = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }
}
