package constructori;

public class MainClass {
    public static void main(String[] args) {
        // definesc Person A care nu mai este un obiect , care este o instanta a clasei Person
        // daca in new Person imi apare cu rosu, inseamna ca, constructorul nu a fost definit
        // A & B sunt 2 variabile ale clasei Person
        Person A = new Person(29, "Adi", "Mocanu");
        Person B = new Person();

        // Printez Person A
        System.out.println("This person " + A.fname + " has " + A.age +
                " years old");

        System.out.println(A);
        System.out.println(B);
    }
}
