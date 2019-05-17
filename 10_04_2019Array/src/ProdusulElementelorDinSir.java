import java.util.Scanner;

public class ProdusulElementelorDinSir {

    public static void main(String[] args) {
        ex5(); }
        public  static void ex5() {

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

            int prod = 1;
            for (int el: arr) {
                prod = prod * el;
            }
            System.out.println(prod);
        }
}