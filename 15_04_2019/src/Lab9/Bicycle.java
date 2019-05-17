package Lab9;

public class Bicycle {

    private int speed;
    private int gear;
    private int cadence;
    public int instanceCount = 0;
    public  static int count = 0;

    static { System.out.println("Am creeat o bicicleta");}  // Instanta statica ce se apeleaza o singura data.

    public Bicycle(int speed, int gear, int cadence) {

        this.speed = speed;
        this.gear = gear;
        this.cadence = cadence;
        count++;
        instanceCount++;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed (int speed) {
            this.speed = speed;
        }

        public int getGear() {
            return gear;
        }

        public void setGear() {
            this.gear = gear;
        }

        public int getCadence() {
            return cadence;

        }

//        public void setCadence(){
//            this.cadence = cadence;
//        }
//
//    }
//
//}
