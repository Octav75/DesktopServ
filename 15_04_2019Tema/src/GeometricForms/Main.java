package GeometricForms;

public class Main {
    public static void main(String[] args) {

    Rectangle rectangle = new Rectangle();
    Square square = new Square();

    rectangle.draw();
    square.draw();

    NewGeometricForms.Rectangle newRectange = new NewGeometricForms.Rectangle();
    NewGeometricForms.Square newSquare = new NewGeometricForms.Square();

    newRectange.draw();  // Apeleaza din paketul NewGeometricForms pentru a nu se intercala cu rectangle din Geometric Forms
    newSquare.draw();
    circle.draw();

    }

}
