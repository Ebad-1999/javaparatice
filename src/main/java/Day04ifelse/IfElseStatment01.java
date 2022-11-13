package Day04ifelse;

import java.util.Scanner;

public class IfElseStatment01 {


    public static void main(String[] args) {


        /* ask from user enter a number between 1 and until 7
        // according to number check the days of the week
        //Ex  1: 1=saturday

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your number between 1 -7");

        int day = input.nextInt();


        //System.out.println(day);

        if(day> 0 && day<6) {
            System.out.println("week day");

        }else if(day>5  &&  day<8) {
            System.out.println("weekend day");
        }else {
            System.out.println("Enter a valid number");

        }

         */

        String a = "java";
        String b ="JAVA";
        if (a.equals(b)){
            System.out.println(a);
        }else if(!(a.equals(b))){
            System.out.println(b);
        }


        int x =9;
        if (x<100){
            System.out.println("Good");
        } else if (x < 100) {
            System.out.println("Better");
        }
        int z = 12;
        int y =10;
        if (z%3==0 && x%5==2){
            System.out.println("Good");
        }else if (z%3==0  || y%5==2){
            System.out.println("Better");
        }











    }



}
