package Constructors;

public class StudentDetails {

    String address;

    //non parameterized constructor
    StudentDetails()
    {
        address = "Thane, Mumbai";
    }

    void display() {

        System.out.println("Address: " +address);
    }

//    public static void main(String[] args) {
//
//        StudentDetails s2 =new StudentDetails();
//        s2.display();
//
//    }


}
