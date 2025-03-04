// Program to find sum from 1 to 100

public class NaturalNumberSum {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            sum = sum + num;
            System.out.printf("current sum: %d\n", sum);
            num++;
        }

        System.out.printf("Sum from 1 to 100: %d\n", sum);
    }
}
