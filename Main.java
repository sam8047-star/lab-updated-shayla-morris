/**

 * Project: Lab 1
 * Purpose Details: Lab Motorcycle
 * Course: IST 242
 * Author: Shayla Morris
 * Date Developed:
 * Last Date Changed:
 * Rev:

 */

public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike("Pink", 60, Material.PLASTIC, 17.0);
        myBike.setColor("Purple");
        myBike.setSize(40.0);
        Bike myBike2 = new Bike("Orange", 57.0, Material.WOOD, 20.0);
        myBike2.setColor("Blue");
        Bike myBike3 = new Bike("Brown", 88.0, Material.STONE, 29.0);
        System.out.println("Bike color: " + myBike.getColor());
        System.out.println("Bike size: " + myBike.getSize());
        System.out.println("Frame material: " + myBike.getFrameMaterial());
        System.out.println("Wheel size: " + myBike.getWheelSize());
        myBike.start();
        myBike.stop();

        System.out.println("Bike color: " + myBike2.getColor());
        System.out.println("Bike size: " + myBike2.getSize());
        System.out.println("Frame material: " + myBike2.getFrameMaterial());
        System.out.println("Wheel size: " + myBike2.getWheelSize());
        myBike2.start();
        myBike2.stop();

        System.out.println("Bike color: " + myBike3.getColor());
        System.out.println("Bike size: " + myBike3.getSize());
        System.out.println("Frame material: " + myBike3.getFrameMaterial());
        System.out.println("Wheel size: " + myBike3.getWheelSize());
        myBike3.start();
        myBike3.stop();
    }
}