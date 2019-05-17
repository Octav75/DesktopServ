package Biblioteca;

public class Verificari {

    public static boolean dubluEx (Carte c1, Carte c2)  {
        return c1.getTitlu().equals(c2.getTitlu());
    }

    public static Carte getBigger(Carte c1, Carte c2) {
        if (c1.getNrPag() > c2.getNrPag()){
            return c1;
        }
        else {
            return c2;
        }

        // Acelasi lucru face si (in loc de if:
        // return c1.getNrPag() > c2.getNrPag() ? c1 : c2;

    }

}
