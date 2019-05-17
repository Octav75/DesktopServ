package Recapitulare;

public class VeterinaryTest {
    public static void main(String[] args) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.setCats(99);
        vr.setDogs(199);
        vr.displayStatistics();
        System.out.println("The class metod sais there are " + vr.getAnimalsNo() + " animals");

        VeterinaryReport veterinaryReport2 = new VeterinaryReport();
        veterinaryReport2.setDogs(5);

        System.out.println("Vet 1 no of dogs " + vr.getDogs());
        System.out.println("Vet 2 no of cats " + vr.getCats());

    }

 }

