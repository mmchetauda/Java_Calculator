// Program to print the series 4, 7, 11 and their sum upto 20

public class SeriesSum {
    public static void main(String[] args) {
        int num = 4;
        int next = 3;
        int sum = 0;
        while(num <= 20) {
            System.out.println(num);
            sum = sum + num;
            num = next + num;
            next = next + 1;
        }

        System.out.printf("Sum: %d", sum);
    }
}
