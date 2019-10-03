package functii;

public class FunctiiInJava2 {
    public static void main(String[] args) {
        System.out.println("Salut !");

        String nume = new String("Test nume");
        int valoare = Functie(nume, 2, 3); // valoare = ceea ce imi intoarce functia "Functie"
        System.out.println(valoare);
        // babeste:

        numeUser("Octav");
        System.out.println(numeUser("Octav!")); // functia userName imi intoarce un string
        // care este preluat de jos (cu tot cu "Numele tau este").
        // System.out.println(numeUser("Octav")); // functia numeUser este apelata pentru a fi printata

        String temp = numeUser("Octav");
        // apelat de nunctia numeUser avem sirul "Numele tau este Octav"
        System.out.println(temp.length() + " - Nr. total de caractere din sir" + "\n Sirul este :" + " " + temp);
        // ptintam lungimea sirului si sirul pentru a intelege mai bine
    }

    // functia "Functie"
    public static int Functie(String nume, int a, int b) {
        int sum = a + b;
        System.out.println("Salutare " + nume + " !");
        return sum;
    }

    public static String numeUser(String nume) {
        String intoarce = "Numele tau este " + nume;
        return intoarce;
    }
}
