import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number -> ");
        int first = input.nextInt();
        System.out.print("Second number -> ");
        int second = input.nextInt();
        System.out.print("Third number -> ");
        int third = input.nextInt();

        if(first >= second && first >= third) {
            System.out.printf("%d is greatest", first);
        } else if(second >= first && second >= third) {
            System.out.printf("%d is greatest", second);
        } else {
            System.out.printf("%d is greatest", third);
        }

        input.close();
    }
}
