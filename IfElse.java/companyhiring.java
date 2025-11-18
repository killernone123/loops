import java.util.*;

public class companyhiring {
    public static void main(String[] args) {
        // A company hires a person if
        // If person is married
        // if person is unmarried, male and above 30 years of age
        // if person is unmarried , female and above 25 years of age

        Scanner sc = new Scanner(System.in);

        System.out.println("Tell Your married status");

        char status = sc.next().charAt(0); // U / M

        System.out.println("Tell Your age");

        int age = sc.nextInt();

        System.out.println("Tell Your gender");

        char gender = sc.next().charAt(0); // M / F

        if (status == 'M' || status == 'm') {
            System.out.println("You are Hired");
        } else if (age > 30 && (gender == 'm' || gender == 'M')) {
            System.out.println("You are Hired");
        } else if (age > 25 && (gender == 'f' || gender == 'F')) {
            System.out.println("You are Hired");
        } else {
            System.out.println("You are not Hired");
        }

    }
}