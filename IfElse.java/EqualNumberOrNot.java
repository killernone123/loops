import java.util.*;

public class EqualNumberOrNot {
    public static void main(String[] args){
        // Write a Java program that accepts three numbers and
        // checks whether all numbers are equal or not

     Scanner sc = new Scanner (System.in);

     int num1 =sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();

     if(num1== num2 && num1 ==num3){
        System.out.println("Yes the number are equal");
     }else{
        System.out.println("no thr numbe are not equal");
     }

    }
}