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
        Engine engine = new Engine(30, 40);
        Motorcycle myMotorcycle = new Motorcycle("Pink", 60, Material.PLASTIC, 17.0, engine);
        myMotorcycle.setColor("Purple");
        myMotorcycle.setSize(40.0);
        Engine engine2 = new Engine(40, 60);
        Motorcycle myMotorcycle2 = new Motorcycle("Orange", 57.0, Material.WOOD, 20.0, engine2);
        myMotorcycle2.setColor("Blue");
        Motorcycle myMotorcycle3 = new Motorcycle("Brown", 88.0, Material.STONE, 29.0);
        System.out.println("Motorcycle color: " + myMotorcycle.getColor());
        System.out.println("Motorcycle size: " + myMotorcycle.getSize());
        System.out.println("Frame material: " + myMotorcycle.getFrameMaterial());
        System.out.println("Wheel size: " + myMotorcycle.getWheelSize());
        System.out.println("Engine CC: " + myMotorcycle.getEngine().getCC());
        System.out.println("Engine HP: " + myMotorcycle.getEngine().gethp());
        myMotorcycle.start();
        myMotorcycle.stop();

        System.out.println("Motorcycle color: " + myMotorcycle2.getColor());
        System.out.println("Motorcycle size: " + myMotorcycle2.getSize());
        System.out.println("Frame material: " + myMotorcycle2.getFrameMaterial());
        System.out.println("Wheel size: " + myMotorcycle2.getWheelSize());
        System.out.println("Engine CC: " + myMotorcycle2.getEngine().getCC());
        System.out.println("Engine HP: " + myMotorcycle2.getEngine().gethp());
        myMotorcycle2.start();
        myMotorcycle2.stop();

        System.out.println("Motorcycle color: " + myMotorcycle3.getColor());
        System.out.println("Motorcycle size: " + myMotorcycle3.getSize());
        System.out.println("Frame material: " + myMotorcycle3.getFrameMaterial());
        System.out.println("Wheel size: " + myMotorcycle3.getWheelSize());
        myMotorcycle3.start();
        myMotorcycle3.stop();
    }
}