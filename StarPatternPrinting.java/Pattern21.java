public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int nst =1;
        for(int i = 1; i <= n; i++) {
            int print =1;
            for(int j = 1; j <= nst; j++) {
                System.out.print("  "+print+" ");
                if(j<=nst/2){
                    print++;
                } else {
                    print--;
                }
            }
            nst += 2;
            System.out.println();
        }
    }
}