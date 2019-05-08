public class Student {

    private String nume;
    private int varsta;
    private Facultate facultate;

    public Student (String nume, int varsta, Facultate facultate) {

        this.nume = nume;
        this.varsta = varsta;
        this.facultate = facultate;
    }
    public String getNume() {return nume;}
    public int getVarsta() {return varsta;}
    public Facultate getFacultate() {return facultate;}

}
