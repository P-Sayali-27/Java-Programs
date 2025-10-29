package Keywords;

public class dog extends Animal{

    String name = "Dog";

    //child class constructor
    dog()
    {
        super(); //calls parent constructor
        System.out.println("Dog constructor called");
    }

    void display()
    {
        System.out.println("Child class name: " + name);
        System.out.println("parent class name: " + super.name);
    }
    void makeSound() {
        super.sound(); // Calls parent class method
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.display();
        d.makeSound();
    }

}
