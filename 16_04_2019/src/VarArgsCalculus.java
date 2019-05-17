public class VarArgsCalculus {

    public static void main(String[] args) {

        System.out.println(sum(1, 4, 6, 78, 80));
        System.out.println(sum2(1, 4, 5, 55));
        System.out.println(sum3(2, 3, 1, 2, 3));
        printEven(1, 2, 3, 4, 5);
        printEvenAndOdd(1, 2, 3, 4, 5, 6, 7, 8);

    }

    public static int sum(int... elements) {

        int sum = 0;
        for (int el : elements) {
            sum += el;
        }
        return sum;
    }

    //Acelasi lucru il face si metoda urmatoare:

    public static int sum2(int... elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        return sum;
    }

    // Inmultim numarul care este dat ca parametru cu suma elementelor:

    public static int sum3(int nr, int... el2) {
        int sum = 0;
        for (int el : el2) {
            sum += el;
        }
        return sum * nr;

    }

    // sa printeze numerele pare care intra ca si argument

    public static void printEven(int... elements) {
        for (int el : elements) {
            if (el % 2 == 0) {
                System.out.println(el);
            }
        }
    }

    // Sa se printeze dintr-un sir de numere pe cele pare si cele impare
    // 12345678
    // Numere pare: 2468
    // Numere impare: 1357

    public static void printEvenAndOdd(int... elements) {
        int[] par = new int[elements.length];
        int[] impar = new int[elements.length];

        int k = 0;
        int t = 0;

        for (int el : elements) {
            if (el % 2 == 0) {
                par[k] = el;
                k++;
            } else {
                impar[t] = el;
                t++;
            }
        }

        // le printam

        System.out.print("Numere Pare: ");
        for (int i = 0; i < k; i++) {
            System.out.print(par[i] + " ");
        }
        System.out.println();
        System.out.print("Numere Impare: ");
        for (int i = 0; i < t; i++) {
            System.out.print(impar[i] + " ");
        }

    }
}

