package Laborator8;

public class Operatii {

    private int a;
    private int b;
    private int c;
    private int Media;
    private int sum;

    public Operatii(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        }

        public int getMedia (int a, int b, int c) {return Media;}
        public int getSum (int a, int b, int c) {return  sum;} {

        sum = a + b + c;
        Media = sum / 3;

    }

}
//    private int a;
//    private int b;
//    private int c;
//
//    public Operatii(int a, int b, int c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//
//}
//
//public int getMin (int a, int b, int c) {
//    int min;
//    if (a < b) {
//        min = a;
//    } else {
//        min = b;
//    }
//    if (min > c) {
//        min = c;
//    }
//    return min;
//}



//
//public int getMax(int a, int b, int c) {
//
//    int max;
//    if (a > b){
//        max=a;
//        } else {
//        max = b;
//        }
//    if (max < c) {
//        max = c;
//        }
//    return max;
//}

