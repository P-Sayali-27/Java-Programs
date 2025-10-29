package PolymorphismProgram;

public class Polymorphism {


    void  personalDetails(int age, int ID) {
        System.out.println("Age: " + age  + ", ID: " + ID);
    }

    void personalDetails(String name, int ID) {
        System.out.println("Name: " + name + " ID: " + ID);
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.personalDetails(25, 111);
        obj.personalDetails("Sayali   ", 222);

    }


}
