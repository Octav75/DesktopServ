public class MainNC {

    public static void main(String[] args) {

        NumarComplex nc1 = new NumarComplex();
        nc1.setRez(10);
        nc1.setImg(13);

        NumarComplex nc2 = new NumarComplex();

        nc2.setRez(18);
        nc2.setImg(89);

        NumarComplex ncAdd = Operatii.add(nc1, nc2);

        System.out.println("Real: " + ncAdd.getRez());
        System.out.println("Img: " + ncAdd.getImg());
    }
}
