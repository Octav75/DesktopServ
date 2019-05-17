package main.java.Calculator;

import java.util.Scanner;

public class CitireDeLaTastatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti de la tastatura primul numar: a = ");
        int nr1 = sc.nextInt();
        System.out.println("Introduceti de la tastatura al doilea numar: b = ");
        int nr2 = sc.nextInt();
        System.out.println("Suma este = " + sum(nr1, nr2));

    }

    static int sum (int a, int b){
        int sum = a + b;
        return sum;
    }
}
