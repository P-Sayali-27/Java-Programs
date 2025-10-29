package Constructors;

public class Student {

    String name;
    int age;
    String address;

    //parameterized cnstructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("parameterized constructor called");
    }
//non parameterized constructor
    Student()
    {
        address = "Thane, Mumbai";
    }

    void display() {
        System.out.println("Name: " + name + ", age: " + age);

        System.out.println("Address: " +address);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sayali", 25);//calling constructor with parameters
        s1.display();

//        Student s2 =new Student();
//        s2.display();

    }
}