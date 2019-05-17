import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {
        Tema1();
    }

    public static void Tema1() {

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

            while (!string.equals("Quit")) {


                StringBuilder stringBuilder = new StringBuilder(string);

                stringBuilder = stringBuilder.reverse();

                System.out.println(stringBuilder);

                string = in.nextLine();

            }

    }

}
