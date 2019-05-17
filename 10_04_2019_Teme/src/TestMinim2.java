public class TestMinim2 {

    public static void main(String[] args) {
        Tema3(); }

    public static void Tema3() {

        int[] arr = {7, 2, 4, 10, 12};  // Citesc sirul de la tastatura

        int min = Integer.MAX_VALUE;    // Definesc de unde incepe comparatia ci de la cel mai mare numar pozitiv

        for (int el : arr) {    // Verific toate campurile array-ului

            if (el < min) {     // Fac comparatie de intre fiecare camp al sirului si maximul existent, retinand noul minim.
                min = el;
            }
        }
        System.out.println("Cel mai mic: " + min);  // Printez valoarea numarului minim.
    }
}