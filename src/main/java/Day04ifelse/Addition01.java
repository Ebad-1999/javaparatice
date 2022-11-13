package Day04ifelse;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Addition01 {
    public static void main(String[] args) {


        //ask from user input two number and select operation from user and do four types of operations ( +,-,*,/)we Scanner (System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        double Num1 = input.nextDouble();
        System.out.println("Enter your operation");
        String operation = input.next();
        System.out.println("enter your second number");
        double Num2 = input.nextDouble();

        double total = 0;

        if (operation.equals("+")) {
            total = Num1 + Num2;
            System.out.println();// 2 + 3 = 5
        } else if (operation.equals("-")) {
            total = Num1 - Num2;
            System.out.println(Num1 + "  " + operation + "  " + Num2 + "=" + (total));
        } else if (operation.equals("*")) {
            total = Num1 * Num2;
            System.out.println(Num1 + "  " + operation + "  " + Num2 + "=" + (total));
        } else if (operation.equals("/")) {
            total = Num1 / Num2;
            System.out.println(Num1 + "  " + operation + "  " + Num2 + "=" + (total));
        } else {
            System.out.println("invalid operation");

        }


    }


}
