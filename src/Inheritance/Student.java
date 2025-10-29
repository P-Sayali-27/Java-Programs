package Inheritance;

 class Student extends Person  //Child Class
{
    String course;


    void showStudentDetails()
    {
        showDetails(); //Inherited method
        System.out.println("Course: " + course);
    }
}

