// Program to reverse the given digit

import java.util.Scanner;

public class ReverseDigit {
    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = (num % 10) + (reversed * 10);
            num = num / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int number = input.nextInt();
        int reversedNum = reverse(number);
        System.out.println("Number after reversed is " + reversedNum);
        input.close();
    }
}
