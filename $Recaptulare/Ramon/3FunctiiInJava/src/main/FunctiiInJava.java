package main;

public class FunctiiInJava {
    public static void main(String[] args) {
        System.out.println("Salut!");
       // Hello("Octav");  // Aici apelez functia Hello

        String name = new String("TestNume"); // Aloc mui nume valoarea TestNume.
        Hello(name, 2 , 3);

    }

    public static void Hello(String nume, int a, int b){    // Aici am functia Hello (aici o creez)
        int sum = a + b; // Acum in functia Hello am definit in string si 2 integer-uri(a si b).
        // Am facut suma celor 2 numere
        System.out.println("Salutare " + nume + "!" + "\n" + String.valueOf(sum)); // Printez Salutare si
        // apelez functia Heelo (care imi apeleaza nume si suma a 2 integer-re, suma transformand-o intr-un String pt.
        // a putea sa o printez.)
        // cu \n am scris suma pe linia urmatoare.
    }
}
