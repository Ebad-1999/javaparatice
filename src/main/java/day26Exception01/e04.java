package day26Exception01;

public class e04 {

    public static void main(String[] args) {

        age(-57);
        printAge(12);

    }

    public static void age(int age){

        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println(age);
    }

    public static void printAge(int age){

        if (age<16){
            throw new  IllegalArgumentException("Invalid age");
        }
        System.out.println(age);


    }
}
