import java.util.Scanner;

public class PrintKeybaordInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduceti prenumele:");
        String first_name = input.next();
        System.out.println("Introduceti numele: ");
        String last_name = input.next();
        System.out.println();
        System.out.println("Hello \n" + first_name + " " + last_name);
    }
}
