import java.util.Scanner;

public class MiddleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number -> ");
        int first = input.nextInt();
        System.out.print("Second number -> ");
        int second = input.nextInt();
        System.out.print("Third number -> ");
        int third = input.nextInt();

        if((first > second && first < third) || (first < second && first > third) ) {
            System.out.printf("%d is middle number", first);
        } else if((second > first && second < third) || (second < first && second > third)) {
            System.out.printf("%d is middle number", second);
        } else {
            System.out.printf("%d is middle number", third);
        }

        input.close();
    }
}
