public class Overloading {
    public static void sum(int num1, int num2) {
        System.out.printf("%d + %d: %d\n", num1, num2, num1 + num2);
    }
    public static void sum(int num1, int num2, int num3) {
        System.out.printf("%d + %d + %d: %d\n", num1, num2, num3, num1 + num2 + num3);
    }
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
    }
}
