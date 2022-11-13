package day01variable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner02 {
        public static void main(String[] args) {

          //Task1 ask for user enter first name and last name also print full name

            Scanner myObject = new Scanner(System.in);
            /*
            System.out.println("please enter your name");
            String firstName = myObject.nextLine();
            System.out.println("please enter your last name");
            String lastName = myObject.nextLine();
         // String fulName = firstName +"  "+ lastName;
            System.out.println(firstName + "  "+ lastName);







            //Task2 ask for user enter email and password also print full name
            System.out.println("please enter your name");
            String name = myObject.nextLine().toLowerCase();
            System.out.println("your email");
            String emailAdd = myObject.nextLine().toLowerCase();
            System.out.println("enter your password");
            String password = myObject.nextLine().toLowerCase();
            //System.out.println("Hello Mr "+name+" "+ emailAdd+" "+password);

            System.out.println("Hello Mr: " + name);
            System.out.println("your email is : "+emailAdd);
            System.out.println("your password: "+password);

             */

            /*Q.1
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two integers");
            int i = scan.nextInt();
            int ii = scan.nextInt();
            System.out.println("The width is "+" "+(i/ii));
            System.out.println("The length is"+" "+(i+ii));
            System.out.println("The area is"+" "+(i+ii)*(i/ii));
            System.out.println("The perimeter is"+" "+2*((i+ii)+(i/ii)));

             */
            //Q.2: swap
            Scanner input = new Scanner(System.in);
            System.out.println("Enter tow number");

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int temp = input.nextInt();
            System.out.println(num2 = temp);
            System.out.println(temp = num1);
            System.out.println(num1 = num2);





        }
}
