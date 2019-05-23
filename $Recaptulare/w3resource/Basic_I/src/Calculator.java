import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Introduceti primul numar:");
        Scanner index = new Scanner(System.in);
        Double a = index.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        Double b = index.nextDouble();
        Double sum = a + b;
        Double sub = a - b;
        Double multy = a * b;
        Double div = a / b;
        Double mod = a % b;

        System.out.println("Suma = " + sum);
        System.out.println("Diferenta =" + sub);
        System.out.println("Inmultirea este =" + multy);
        System.out.println("Impartirea =" + div);
        System.out.println("Restul impartirii =" + mod);

    }
}
