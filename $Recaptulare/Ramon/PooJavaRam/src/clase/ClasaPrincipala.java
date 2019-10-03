package clase;

public class ClasaPrincipala {
    public static void main(String[] args) {

        // Un numar intreg se poate defini in 2 moduri: ca obiect (x) sau ca variabila primara (y)

        // "Integer x" este un obiect (pe care il initializam cu new si dupa aceea ii dam o valoare)
        // Avantajul obiectului Integer x este ca il putem folosi ulterior,
        // apeland metodele din clasa Integer.
        // x = un obiect care va prelua proprietatile clasei Integer
        // Integer x il pot transforma in toString si astfel datele bancare sunt codate.
        // x devine o litera.
        Integer x = new Integer(5);
        // "int y" este o variabila primara
        int y = 0;

        System.out.println(x.toString() + "tare");
        System.out.println(y);

        String a = new String("abc");
        // b este un substring sin stringul abc compus din primele 2 pozitii ale stringului.
        String b = a.substring(0, 2);

        System.out.println(a + " vs. " + b);

        // definesc un obiect (obiect1) care se numeste "ClasaMea" pe care il inititlizez
        ClasaMea obiect1 = new ClasaMea();
        // am creeat o claa "ClasaMea" cu anumite variabile (x, a) apelabila in alta clasa (ClasaPrincipala)

        // din ClasaPrincipala am adaugat anumite valori variabilelor x si a din ClasaMea
        obiect1.x = 10;
        obiect1.a = "Octav";
        // folosesc valorile date de obiect1.a si obiect1.x pentru a le atribuii finctiei
        // functia numeleMeu din clasa ClasaMea intoarce rezultatul dupa ce am aplicat
        // valorile date de obiect1.a si obiect1.x
        System.out.println(obiect1.numeleMeu(obiect1.a + obiect1.x));

    }
}
