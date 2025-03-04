import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First letter: ");
        String name = input.nextLine();

        switch (name) {
            case "a":
            case "A":
                System.out.println("Aryan");
                System.out.println("Abinash");
                break;
            case "b":
                System.out.println("Bishal");
                break;
            case "c":
                System.out.println("Christina");
                break;
            case "d":
                System.out.println("Diwakar");
                break;
        
            default:
            System.out.println("Invalid entry");
                break;
        }
        input.close();
    }
}
