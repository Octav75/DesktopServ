import java.util.Scanner;

public class DivOfTwoNUmbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        double a = input.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        double b = input.nextDouble();
        double div = a / b;
        System.out.println("Rezultatul impartirii este:" + div);
    }
}
