import java.util.Scanner;

public class SumaElementeSir {

    public static void main(String[] args) {
        ex4();
    }

    public static void ex4() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lungime: ");    // Citim lungimea sirului de la tastatura
        int n = scanner.nextInt();   // Citim lungimea sirului de la tastatura

        System.out.println();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element pozitia " + " =");
            int el = scanner.nextInt();
            arr[i] = el;

        }

        int sum = 0;
        for (int el: arr) {
            sum = sum + el;
        }
        System.out.println(sum);
    }
}