import java.util.*;

public class MarksToGrade {
    public static void main(String[] args) {
        // Write a program to input marks of five subjects Physics, Chemistry, Biology,
        // mathematics, and computer Calculate percentages and grades according to
        // following:
        // Percentage >= 90%: Grade A
        // Percentage >= 80%: Grade B
        // Percentage >= 70%: Grade C
        // Percentage >= 60%: Grade D
        // Percentage >= 40%: Grade E
        // Percentage < 40%: Grade F
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int biology = sc.nextInt();
        int mathematics = sc.nextInt();
        int computerScience = sc.nextInt();
        int totalMarksObtained = physics + chemistry + biology + mathematics + computerScience;
        int percentage = (totalMarksObtained * 100) / 500;
        if (percentage >= 90) {
            System.out.println("A Grade");
        } else if (percentage >= 80) {
            System.out.println("B Grade");
        } else if (percentage >= 70) {
            System.out.println("C Grade");
        } else if (percentage >= 60) {
            System.out.println("D Grade");
        } else if (percentage >= 40) {
            System.out.println("E Grade");
        } else {
            System.out.println("F Grade");
        }
    }
}