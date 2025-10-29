package InterfaceClass;

class Bike implements Vehicle{

    public int tires() {
        return 2;
    }
    public void start() {System.out.println( "Bike starts with Key ignition");}
    public void stop() {System.out.println( "Bike stops with Brakes");}
}