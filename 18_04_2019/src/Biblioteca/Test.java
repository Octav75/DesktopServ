package Biblioteca;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

//        ex2();
        ex3();
    }

    public static void ex3() {
        Carte carte1 = getCarte();
        Carte carte2 = getCarte();

        Carte ceaMaiMare = Verificari.getBigger(carte1, carte2);
        System.out.println(ceaMaiMare.getTitlu());
    }

    public static void ex2() {
        Carte carte1 = getCarte();
        Carte carte2 = getCarte();

        System.out.println();
        Carte carte = getCarte();

        System.out.println("Titlul cartii este: "+carte.getTitlu());

        if(carte.getNrPag()<=0)

        {
            System.out.println("Cartea nu are pagini");
        }
        else

        {
            System.out.println("Cartea are pagini");
        }
    }


    private static Carte getCarte() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Titlu: ");
        String titlu = sc.nextLine();

        System.out.println();
        System.out.println("\nAutor: ");
        String autor = sc.nextLine();

        System.out.println("\nEditura: ");
        String editura = sc.nextLine();

        System.out.print("\nNr.Pagini: ");
        int nrPag = sc.nextInt();

        return new Carte(titlu, autor, editura, nrPag);
    }

}


