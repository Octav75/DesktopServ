public class Facultate {

    private String name;
    private Universitate universitate;

    public Facultate (String name, String Universitate) {

        this.name = name;
        this.universitate = universitate;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Universitate getUniversitate() {

        return universitate;
    }
}
