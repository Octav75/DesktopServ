public class Operatii {

    public static NumarComplex add(NumarComplex nc1, NumarComplex nc2) {
        NumarComplex ncRez = new NumarComplex();
        ncRez.setRez(nc1.getRez() + nc2.getRez());
        ncRez.setImg(nc1.getImg() + nc2.getImg());

        return ncRez;
    }

    public static NumarComplex multiply(NumarComplex nc1, NumarComplex nc2) {
        NumarComplex ncImg = new NumarComplex();
        ncImg.setImg(nc1.getImg() + nc2.getImg());


        return ncImg;

    }

}
