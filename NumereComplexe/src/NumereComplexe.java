public class NumereComplexe {

    public static void main(String[] args) {
//        System.out.println("Adunare " );
        Operatii a = new Operatii();
        a.adunare();
        a.inmultire();
        System.out.println(a.getRe());
        System.out.println(a.getIm());
    }
}
