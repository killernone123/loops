public class NumPattern {
    public static void main(String[] args){
        int n =5;
        for(int i =1; i<=n; i++){
            int print =i;
            int add =n;
            for(int j =1; j<=i ; j++){
                System.out.print(" "+print+" ");
                add--;
                print += add;
            }
            System.out.println();
        }
    }
}
