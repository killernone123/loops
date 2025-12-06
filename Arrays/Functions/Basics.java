
public class Basics {
    public static void main(String[] args) {
        Greet();
        int c = 10;
        int d = 20;
        int sum  =  sum(c,d);
        System.out.println("The sum is: " + sum);
    }

    public static void Greet() {
        System.out.println("Hello User");
    }
    public  static int sum(int a , int b){
        int sum = a +b;
        return sum;

    }
}
 