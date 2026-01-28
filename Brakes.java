public class Brakes {
    int speed = 50;

    public void brakes() {
        speed = speed - 10;
        System.out.println("Braking. Speed is now: " + speed);
    }

    public static void main(String[] args) {
        Brakes myBike = new Brakes();
        myBike.brakes();
    }
}