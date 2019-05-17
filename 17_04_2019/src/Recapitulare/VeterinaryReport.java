package Recapitulare;

public class VeterinaryReport {
    private int dogs;
    private int cats;

    public int getAnimalsNo() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is: " + getAnimalsNo());
    }

    public int getCats() {
        return cats;
    }

    public int getDogs() {
        return dogs;
    }

    public void setCats(int cats) {
        this.cats = cats;
    }

    public void setDogs(int dogs) {
        this.dogs = dogs;
    }
}
