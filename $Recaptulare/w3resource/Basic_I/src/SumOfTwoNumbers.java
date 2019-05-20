import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduceti primul numar:");
        int a = scanner.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int b = scanner.nextInt();
        int sum = 0;
        sum = a + b;
        System.out.println("Suma este:" + sum);
    }
}
