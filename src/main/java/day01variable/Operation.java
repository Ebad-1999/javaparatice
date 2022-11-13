package day01variable;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

            // Take 2 integer from user and do addition
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("please enter your first number");
            int num1 = myObj.nextInt();
            System.out.println("please enter your second number");
            int num2= myObj.nextInt();
            int total = num1+num2;
            System.out.println("addition:"+ total);


            int subtract = num1-num2;
            System.out.println("subtraction:"+ subtract);

            int mulitple = num1*num2;
            System.out.println("multilication:"+ mulitple);

            int dev = num1/num2;
            System.out.println("devision:"+ dev);


        }
}
