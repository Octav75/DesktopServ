import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        ex6();
    }

    public static void ex6() {

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
        int media = sum/n;
        System.out.println(media);
    }
}

