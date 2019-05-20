import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        int a = input.nextInt();
        System.out.println("Introduceti al doilea numar");
        int b = input.nextInt();
        int prod = a * b;
        System.out.println("Produsul este " + prod);
    }
}
