package day04nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
       //switch Statement does the same with "if- else if", it has just different syntax

        //Get the number of days from user and print the name of the day
        //for example

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number");

        byte dayNumber = input.nextByte();
        //1.wa: "if - else if"
        if (dayNumber == 1) {

            System.out.println("Sunday");

        }else if (dayNumber == 1) {

            System.out.println("Sunday");

        }else if (dayNumber == 2) {

            System.out.println("monday");

        }else if (dayNumber == 3) {

            System.out.println("Tuesday");

        }else if (dayNumber == 4) {

            System.out.println("Wednesday");

        }else if (dayNumber == 5) {

            System.out.println("Thursday");

        }else if (dayNumber == 6) {

            System.out.println("Friday");

        }else if (dayNumber == 7) {

            System.out.println("Saturday");

        }else {
            System.out.println("Invalid day number");
        }



        //2.way: "switch statement"  (easy way). the order is not important in switch.

        switch (dayNumber){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day Number");



        }













    }

}
