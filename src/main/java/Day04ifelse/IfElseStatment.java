package Day04ifelse;

import java.util.Scanner;

public class IfElseStatment {


    public static void main(String[] args) {


        // ask from user enter a number between 1 and until 7
        // according to number check the days of the week
        //Ex  1: 1=saturday

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your number between 1 -7");

        int day = input.nextInt();


        //System.out.println(day);

        if(day==1) {
            System.out.println("saturday");

        }else if(day==2) {
            System.out.println("sunday");
        }else if(day==3) {
            System.out.println("monday");
        }else if(day==4) {
            System.out.println("tuesday");
        }else if(day==5) {
            System.out.println("wednesday");
        }else if(day==6) {
            System.out.println("thursday");
        }else if(day==7) {
            System.out.println("friday");
        }else {
            System.out.println("Enter a valid number");
        }




    }
}
