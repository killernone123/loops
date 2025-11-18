import java.util.*;
public class MUltipleTable {
    public  static void main(String[] Args){
   Scanner sc = new Scanner(System.in);

    System.out.println("enter number to print table of that number");

    int n = sc.nextInt();

    for(int i =1; i<= 10; i++){
        System.out.println(n+"*"+i+"="+ n*i);
    
    }
    }
}
