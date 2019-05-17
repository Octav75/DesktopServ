package Laborator8;

public class Room {

    private int width;
    private int height;
    private int lenght;


    public Room(int width, int height, int lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int surface() {
        return this.width * this.lenght;
    }

    public int volume() {
        return this.width*this.lenght * this.height;

    }
}
