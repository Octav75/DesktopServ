import java.util.Scanner;

public class SirCuCitire {

    public static void main(String[] args) {

        ex3(); }

        public static void ex3() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Lungime: ");    // Citim lungimea sirului de la tastatura

            int  n = scanner.nextInt();   // Citim lungimea sirului de la tastatura

            System.out.println();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Element pozitia " + " =");
                int el = scanner.nextInt();
                arr[i] = el;
            }
    }
}
