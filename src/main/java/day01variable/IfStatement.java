package day01variable;

import java.util.Locale;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        /*

        int i = 25;
        if (i%2==0){
            System.out.println("The integer is even");
        }else{
            System.out.println("The integer is odd");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single character");
        String s = input.nextLine().toUpperCase();

        if (s.equals("S")){
            System.out.println("saturday or Sunday");
        }else if (s.equals("M")){
            System.out.println("Monday");
        }else if (s.equals("TU")){
            System.out.println("tuesday");
        }else if (s.equals("W")){
            System.out.println("wednesday");
        }else if (s.equals("TH")){
            System.out.println("thursday");
        }else if (s.equals("F"))
            System.out.println("friday");
        else {
            System.out.println("NOt a day");
        }

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day");
        String t  = scan.nextLine();

        if (t.equals("Saturday")){
            System.out.println("Weekend day");
        }if (t.equals(" Sunday")) {
            System.out.println("Weekend day");
        }else if (t.equals("Monday")){
            System.out.println("Weekday");
        }else if (t.equals("Tuesday")){
            System.out.println("Weekday");
        }else if (t.equals("Wednesday")){
            System.out.println("Weekday");
        }else if (t.equals("Thursday")){
            System.out.println("Weekday");
        }else if (t.equals("Friday")){
            System.out.println("Weekday");
        }else {
            System.out.println("Not a day");
        }















    }
}
