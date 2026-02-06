public class Gas {
    int gasAmount = 0;

    void fillTank() {
        gasAmount = 10;
        System.out.println("Tank is full.");
    }

    void ride() {
        if (gasAmount > 0) {
            gasAmount = gasAmount - 5;
            System.out.println("Gas left: " + gasAmount);
        } else {
            System.out.println("Out of gas!");
        }
    }

    public static void main(String[] args) {
        Gas myBike = new Gas(); // Create bike
        myBike.fillTank();
        myBike.ride();
        myBike.ride();
    }
}