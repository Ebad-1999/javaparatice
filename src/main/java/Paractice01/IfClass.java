package Paractice01;

import java.util.Scanner;

public class IfClass {

    public static void main(String[] args) {
          /*
        int score = 50;
        if (score<100 && score>40){
            System.out.println("Your level is B");
        }
         else if (score>60){
            System.out.println("Your level is c");
        }else {
            System.out.println("fail");
        }



        if (score>60){
            System.out.println("Your level is B");
        }else {
            System.out.println("fail");
        }

        String name ="Frotan";

        if (name.equals("Frotan")){
            System.out.println("you are frotan");
        }else{
            System.out.println(" you are not frotan");
        }

        String name2 ="musleh";
        int length=name2.length();

        System.out.println(length);

        if (length<=10){
            System.out.println("Your name is perfect");
        }else{
            System.out.println("your name is so long");
        }

        int age=15;
       //    data type  variable name Operator assignment              conditon      st1                    st2
            String       age2=  age       >                          19 ?              "your are young"         : "  your are teneger";
        System.out.println(age  > 14 ?  "your are young"  : "  your are teneger");
        System.out.println(age2);


        //Ask user to enter an integer then print 'Even' on the console if the number is even.
        Scanner input =  new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        int num2 = Math.abs(num);
        System.out.println("is the number is even" +(num%2==0));



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int oddNum = scan.nextInt();
        int oddNum2 = Math.abs(oddNum);
        System.out.println("the number is "+(oddNum2%2!=0));

         */


        /*Scanner can = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = can.nextInt();
         int lastDigit = num%10;
        System.out.println(num%10);

         num = num/10;
         int secondDigit = num%10;
        System.out.println(num%10);

        num = num/10;
         int firstDigit = num%10;
        System.out.println(num%10);
        System.out.println(lastDigit + secondDigit+ firstDigit);

         */


       String name = "abcd54545egjjkhjuhagk$#@";
       int numName = name.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numName);















    }

}
