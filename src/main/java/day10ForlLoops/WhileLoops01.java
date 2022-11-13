package day10ForlLoops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        //Example 1: Type code to print integers from 3 to 6

        // 1.Way:
        for (int i = 3; i<7; i++){
            System.out.print(i);
        }
        System.out.println();


        // 2.Way:

        int i = 3;
        while(i<7){
            System.out.print(i);
            i++;
        }
        System.out.println();

        //Example 2: Type code to print odd integers from 12 to 67 in the same line with space between them
        int ii = 12;
        while (ii<68){
            if (ii%2!=0){
                System.out.print(ii +" ");

            }
            ii++;
        }

        System.out.println();

        //Example 3: Type code to find the sum of integers from 12 to 67

        int in = 0;
        int im = 12;
        while (im<67){
            in = in+im;

            im++;
        }
        System.out.print(in);
        System.out.println();

        /*4.Example: Type java code by using while loop,
        write a program that prompts the user to input an integer.
        It should then find the sum of the digits of that number.
        123==>1+2+3=6

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to  find the sum of the digits");

        int digit = scan.nextInt();
        int num =0;
        while (digit>0){

            num=num+digit%10;
            digit=digit/10;

        }
        System.out.println(num);
        System.out.println();

        /*
        Example 5: Type java code by using while loop,
        write a program that prompts the user to input an integer.
        It should then find the multiplication of the digits of that number.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to  find the multiplication of the digits");

        int number = scan.nextInt();
        int mul = 1;

        while (number<11){

            System.out.println();
            mul++;
        }






































    }
}
