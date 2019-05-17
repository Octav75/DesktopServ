public class PatratCuXX {

    public static void main(String[] args) {

        ex6 (); }

    public static void ex6() {

        for (int i = 0; i <= 3; i++) {   // printam pe prima coloana *

            for (int j = 0; j <= 5; j++) { // printam pe prima linie *

                if (i == 0 || i == 3 || j == 0 || j == 5) {  // Daca
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }

}
