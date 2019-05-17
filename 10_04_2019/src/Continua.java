import java.util.Scanner;

public class Continua {

    public static void main(String[] args) {

        ex5(); }

        public static void ex5() {

            Scanner sc = new Scanner(System.in);  // Citesc caractere de la tastatura

            while (true) {

                String string = sc.nextLine();

                if (string.equals("continue")) {

                }

                System.out.println(string);
            }
        }
    }
