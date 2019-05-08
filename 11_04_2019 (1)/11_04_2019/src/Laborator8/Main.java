package Laborator8;

public class Main {

    public static void main(String[] args) {

     Room room = new Room (2, 3, 1);
     System.out.println(room.surface());
     System.out.println(room.volume());

//     Operatii op = new Operatii(4, 6, 10);
//     System.out.println(op.getMin(4, 18, 30));


        Operatii op = new Operatii(1, 2, 3);
        System.out.println(op.getMedia(1,2,3));

    }
}

