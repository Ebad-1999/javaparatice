package Day04ifelse;

import java.util.Scanner;

public class IfElseStatement03 {


    public static void main(String[] args) {


        // ask from user enter full name of the day and show the result three character of every day
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter three first character of day");

        String day = input.nextLine().toUpperCase();
        //      FRI        fri          FRI




        //System.out.println(day);

        if(day.equals("SAT")) {  //equals()
            System.out.println("saturday ");

        }else if(day.equals("SUN")) {
            System.out.println("sunday");
        }else if(day.equals("MON")) {
            System.out.println("monday");
        }else if(day.equals("TUE")) {
            System.out.println("tuesday");
        }else if(day.equals("WED")) {
            System.out.println("wednesday");
        }else if(day.equals("THU")) {
            System.out.println("thursday");
        }else if(day.equals("FRI")) {
            System.out.println("friday");
        }else {
            System.out.println("Enter a valid number");
        }




    }



}
