// Program to calculate the sum of all elements of an array

import java.util.Scanner;

public class SumArray {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element: ");
            nums[i] = input.nextInt();
            i++;
        }
        input.close();
        return nums;
    }

    public static void main(String[] args) {
        int[] myArr = inputArray();
        int i = 0;
        while (i < myArr.length) {
            System.out.println(myArr[i]);
            i++;
        }
    }
}
