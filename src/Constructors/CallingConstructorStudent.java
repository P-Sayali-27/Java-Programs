package Constructors;

public class CallingConstructorStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Sayali", 25);//calling constructor with parameters
        s1.display();
        StudentDetails s2 = new StudentDetails();
        s2.display();
    }
}