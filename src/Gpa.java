import java.util.Scanner;

public class Gpa {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the percentage -> ");
        double per = input.nextDouble();

        if(per >= 90) {
            System.out.println("Grade: A+");
        } else if(per >=80 && per < 90) {
            System.out.println("Grade: A");
        } else if(per >=70 && per < 80) {
            System.out.println("Grade: B+");
        } else if(per >=60 && per < 70) {
            System.out.println("Grade: B");
        } else if(per >=50 && per < 60) {
            System.out.println("Grade: C+");
        } else if(per >=40 && per < 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Not graded");
        }

        input.close();
}
}
