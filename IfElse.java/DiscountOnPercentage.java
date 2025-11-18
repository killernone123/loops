import java.util.*;

public class DiscountOnPercentage {
    public static void main(String[] args){
         // When purchasing certain items, a discount of 10% is offered if the quantity
        // purchased
        // is more than 100. If quantity and price per item are input through the
        // keyboard,
        // write a program to calculate the total expenses



        Scanner sc = new Scanner(System.in);

        int Quantity =sc.nextInt();
        double price = sc.nextInt();

        double total = (double) Quantity * price;

      if(Quantity > 100){
        System.out.println(total * 0.9);
      }else{
        System.out.println(total);
      }
    }
}