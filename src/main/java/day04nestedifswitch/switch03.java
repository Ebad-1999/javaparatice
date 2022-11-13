package day04nestedifswitch;

import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Number.......");
        double first = input.nextDouble();

        System.out.println("Enter the Second Number.......");
        double second = input.nextDouble();

        System.out.println("Enter the operation +, -, *, /, %");
        char operation = input.next().charAt(0);


        switch (operation){
            case '+':
                System.out.println(first+second);
                break;
            case '-':
                System.out.println(first-second);
                break;


            case '*':
                System.out.println(first*second);
                break;

            case '/':
                System.out.println(first/second);
                break;
            case '%':
                System.out.println(first*second/100);
                break;
            default:
                System.out.println("Invalid operation");




        }


    }
}
