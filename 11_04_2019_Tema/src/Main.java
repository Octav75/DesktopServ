public class Main {

    public static void main(String[] args) {

        Universitate universitate = new Universitate("Politehnica");
        Facultate facultate = new Facultate("Electronica");
        Facultate facultate1 = new Facultate("Transporturi");
        Student student1 = new Student("Ion", 20, "Facultatea de Electronica & TC");
        Student student2 = new Student("Vasile", 19, "Facultatea de Transporturi");
        Student student3 = new Student("Marius", 23, "Facultatea de transporturi");

        System.out.println(student1.getNume() + "" + student1.getVarsta() + "" + student1.getFacultate() + "" +student1.);
    }


}
