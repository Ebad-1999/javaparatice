package day04nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
        //if user ener 9 the code will print september,october,november, december
        //if

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month Number");

        byte month = scan.nextByte();

        switch (month){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");//October, November, December (because of break option).
                break;
            default:
                System.out.println("Invalid month number");

        }
        /*
        Note: "break keyword is used in "switch" statement to stop next execution.
         */
    }
}
