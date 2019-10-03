import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner newNumber = new Scanner(System.in);
        System.out.println("Introduceti numarul pe care doriti sa il multiplicati : ");
        int a = newNumber.nextInt();
        int i = 1;
        int multy = 0;
        for (int i = 1; i <= 10; i++) {
        }
        multy = a * i;
        System.out.println ("Care este " + i);
    }
}
