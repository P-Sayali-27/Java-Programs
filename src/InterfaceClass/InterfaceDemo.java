package InterfaceClass;

public class InterfaceDemo {

    public static void main(String[] args)
    {
        Vehicle Car = new Car();
        Vehicle Bike = new Bike();
        System.out.println("Car tires: " + Car.tires());
        Car.start();
        Car.stop();
        System.out.println("Bike tires: " + Bike.tires());
        Bike.start();
        Bike.stop();
    }

}
