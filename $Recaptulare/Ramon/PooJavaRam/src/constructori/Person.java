package constructori;

public class Person {
    // cu ajutorul clasei Person vom defini o persoana care va fi de fapt un obiect apelat in main
    // persoanei ii atribui 3 atribute (age, fname, lname)

    int age;
    String fname;
    String lname;

    // acum definesc constructorul in 2 moduri:

    // definesc constructorul care is valorile de mai sus si le atribuie o valoare
    // acest constructor este default.
    // Atributele constructorului sint definite la creerea constructorului
    // Person B va trece prin acest constructor

    Person() {
        age = 23;
        fname = "Unknown";
        lname = null;
    }

    // o a doua modalitate de a defini un constructor.
    // this.age este referinta la variabila age a clasei (cea declarat la inceput)
    // Atributele constructorului sint definite la creerea apelarea variabilei Person A
    // Person A va trece prin acest constructor
        Person(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }
    // OBS: Diferenta intre o functie si un constructor este ca functia intoarce ceva,
    // pe cand un constructor nu intoarce numic.

    // toString este o functie care imi intoarce valoarea unui constructor (this.fname,
    // this.jname, this.age)

    // toString intoarce valoarea clasei Person A / B ca fiind un string
    // toString ma ajuta sa printez ca aici nu ca in calasa Main.
    public String toString() {
        return "This person's name is: " + this.fname + " " + this.lname +
                " and he / she is " + this.age + " years old";
    }
}
