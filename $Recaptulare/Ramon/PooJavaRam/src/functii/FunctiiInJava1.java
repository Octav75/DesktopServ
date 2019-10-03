package functii;

public class FunctiiInJava1 {
    public static void main(String[] args) {
        System.out.println("Salut!");
        // Hello("Octav");  // Aici apelez functia Hello

        String name = new String("TestNume"); // Aloc lui nume valoarea TestNume.
        Hello(name, 2 , 3);

    }
    // functiile void nu intorc nici un rezultat
    public static void Hello(String nume, int a, int b){    // Aici am functia Hello (aici o creez)
        int sum = a + b; // Acum in functia Hello am definit in string si 2 integer-uri(a si b).
        // Am facut suma celor 2 numere
        System.out.println("Salutare " + nume + "!" + "\n" + String.valueOf(sum)); // Printez Salutare si
        // apelez functia Hello (care imi apeleaza nume si suma a 2 integer-re, suma transformand-o intr-un String pt.
        // a putea sa o printez.)
        // cu \n am scris suma pe linia urmatoare.
    }
}
