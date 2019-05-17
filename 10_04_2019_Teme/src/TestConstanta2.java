public class TestConstanta2 {
    public static void main(String[] args) {
        Tema1(); }
    public static void Tema1() {

        int [] arr = {7, 2, 4, 10, 12};     // Citim sirul de la tastatura
        int m = 9;  // Introducem numarul pe care dorim sa vedem daca este in sir

        boolean exist = false;  // Declaram variabila exist ca falsa pentru a putea incepe comparatia, si cand gaseste numarul, aceasta variabila devine true si o vom printa

        for (int el: arr) {
            if (el == m) {      // Comparam fiecare element din sir
                exist = true;  // Cand il gasim schimbam variabila exist in true

                break;
            }
        }
        if (exist) {
            System.out.println("Exista");   // Daca variabila exist este true printam
        } else {
            System.out.println("Nu exista");
        }
        }
    }
