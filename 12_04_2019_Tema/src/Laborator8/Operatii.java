package Laborator8;

public class Operatii {

//    //Tema 1
//
//    private int a;
//    private int b;
//    private int c;
//    private int Media;
//    private int sum;
//
//    public Operatii(int a, int b, int c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    public int getMedia (int a, int b, int c) {return Media;}
//    public int getSum (int a, int b, int c) {return  sum;} {
//
//        sum = a + b + c;
//        Media = sum / 3;
//
//    }


//    Tema 2

    private int a;
    private int b;
    private boolean isEven = false;


    public Operatii(int a, int b, boolean isEven) {

        this.a = a;
        this.b = b;
        this.isEven = isEven;
    }

    public boolean isEven() {
        isEven = a.equals (b);

        if (isEven == true) {
            System.out.print("true");
        }
        else {
            System.out.print("False");
        }

        return isEven;
    }


}



