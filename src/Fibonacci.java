// Program to print the fibonacci series upto the given range 

import java.util.Scanner;

public class Fibonacci {
    public static void printFibo(int range) {
        int first = -1;
        int second = 1;
        int next = 0;
        int count = 1;
        while (count <= range) {
            next = first + second;
            System.out.printf("%d\t", next);
            first = second;
            second = next;
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int number = input.nextInt();
        printFibo(number);
        input.close();
    }
}
