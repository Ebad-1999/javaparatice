package day20accessModifiersInheritance;

public class Student {

    //Types of access modifier
    //It is accessible from entire the project, there is no restriction
     public String stName = "TomHanks";

    //It can be used just inside the "Student" class.
    //It can be used just inside the class it was created.
     private String stID = "TH202217007";

    //It can be used just inside the "day20accessModifiersInheritance" package
    //It can be used just inside the package it was created
     double stGPA = 3.83;

    //It can be used inside the "day20accessModifiersInheritance" package, and from the child classes in other package
     protected String stAdd = "Miami, FL USA";

}
