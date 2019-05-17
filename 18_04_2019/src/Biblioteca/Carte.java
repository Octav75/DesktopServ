package Biblioteca;

public class Carte {

    private String titlu;
    private String autor;
    private String editura;
    private int nrPag;

    public Carte(String titlu, String autor, String editura, int nrPag) {
        this.titlu = titlu;
        this.autor = autor;
        this.editura = editura;
        this.nrPag = nrPag;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    @Override
    public boolean equals(Object obj) {

    }
}
