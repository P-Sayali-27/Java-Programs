package InterfaceClass;

 class Car implements Vehicle{

    public int tires() {
        return 4;
    }
    public void start() {System.out.println( "car starts with Key ignition");}
     public void stop() {System.out.println( "car stops with Brakes");}
}
