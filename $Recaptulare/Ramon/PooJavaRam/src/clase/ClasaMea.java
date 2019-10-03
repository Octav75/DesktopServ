package clase;

public class ClasaMea {
    // o clasa public poate fi apelata din alte clase sau alte pachete (ex. din ClasaPrincipala)
    // am creeat 2 variabile
    int x;
    String a;

    // aici am dfinit o metoda / functia care se numeste numele meu, care cere ca parametru un nume
    // si va intoarce un nume ca si String.
    public String numeleMeu(String nume) {
        return nume;
    }
}
