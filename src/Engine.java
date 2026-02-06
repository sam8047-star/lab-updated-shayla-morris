public class Engine {
    /** Private int that stores the bikes CC  **/
    private int cc;
    /**  Private int that stores the bikes hp **/
    private int hp;
    /** Private int that stores brand **/
    private String brand;
    /** public constructor **/
    public Engine(int cc) {
        this.cc = cc;
    }
    /** constructor with Engine as the class **/

    public Engine(int cc, int hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public Engine(int cc, int hp, String brand) {
        this.cc = cc;
        this.hp = hp;
        this.brand = brand;
    }

    public void setCC(int c1){
        this.cc = c1;
    }

    public int getCC() {
        return this.cc;
    }

    public void sethp(int hp){
        this.hp = hp;
    }

    public int gethp () {
        return this.hp;
    }

    public void setbrand(String brand){
        this.brand = brand;
    }

    public String getbrand () {
        return this.brand;
    }
}