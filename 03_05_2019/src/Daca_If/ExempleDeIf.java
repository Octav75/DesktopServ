package Daca_If;

//if (expresie booleana){
//    declaratie sau block de cod
//        }
//
//if (expresie booleana){
//    declaratie sau block de cod
//        } else {
//    declaratie sau block de cod
//        }
//
//if (expresie booleana){
//    declaratie sau block de cod
//        } else if (expresie booleana){
//    declaratie sau block de cod
//        } else
//            declaratie sau block de cod
//        }

public class ExempleDeIf {
    public static void main(String[] args) {
        metodaYouWin (111);
    }

    static void metodaYouWin (int points) {
        if (points >= 100) {
            System.out.println(("You Win!"));
        }
    }
//        else {
//            System.out.println("You Loose!");
//        }
//    }
//}