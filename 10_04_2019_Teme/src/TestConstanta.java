        import java.util.Scanner;

public class TestConstanta {
    public static void main(String[] args) {
        Tema1(); }
    public static void Tema1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul cautat: ");

        int m = scanner.nextInt();

        System.out.println();

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 99;

        int n = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            n = arr[i];
        }
        for (int el : arr) {

            System.out.print(el + " ");
        }

        while (m == n) {
            System.out.println(m);

        }

    }
}
