public class Motorcycle {
    private Material frameMaterial;
    private String color;
    private double size;
    private Wheel[] wheels;
    private Engine engine;

        public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize) {
        this.color = color;
        this.size = size;
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.frameMaterial = frameMaterial;
    }

    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize, Engine engine) {
        this.color = color;
        this.size = size;
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.frameMaterial = frameMaterial;
        this.engine = engine;
    }

    public String getColor(){return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public Material getFrameMaterial(){
        return frameMaterial;
    }

    public double getWheelSize(){
        return wheels[0].getSize();
    }

    public void start() {
        System.out.println("Motorcycle started!");
    }
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}