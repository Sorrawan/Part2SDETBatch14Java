package review5;

public abstract class AbstractionCar {

    //With help of abstract class we can achieve 0 to 100% abstraction
    String color, make, model;

    public AbstractionCar(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    void drive(){
        System.out.println("All car can drive");
    }

    abstract void start();
    abstract void stop();

}
class Tesla extends AbstractionCar{

    public Tesla(String color, String make, String model) {
        super(color, make, model);
    }

    @Override
    void start() {
        System.out.println(make+" starts automatically");
    }

    @Override
    void stop() {
        System.out.println(make+" stops when we press break");
    }
    public void charge(){
        System.out.println("All car can charge");
    }
}
class Test{
    public static void main(String[] args) {
        AbstractionCar car=new Tesla("Yellow","X","Tesla");
        car.drive();
        car.start();
        car.stop();
        // car.charge();  => can't use because there is no "charge method" in Parent class


        Tesla tesla=new Tesla("green","Y","Tesla");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
    }
}