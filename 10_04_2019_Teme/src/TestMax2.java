public class TestMax2 {

    public static void main(String[] args) {
        Tema2(); }

    public static void Tema2() {

        int[] arr = {7, 2, 4, 10, 12};  // Citesc sirul de la tastatura

        int max = Integer.MIN_VALUE;    // Definesc de unde incepe comparatia (nu de la 0, deoarece putem avea si numere negative) ci de la cel mai mic numar negativ

        for (int el : arr) {    // Verific toate campurile array-ului

            if (el > max) {     // Fac comparatie de intre fiecare camp al sirului si maximul existent, retinand noul maxim.
                max = el;
            }
        }
        System.out.println("Cel mai mare: " + max);  // Printez valoarea numarului maxim.
    }
}