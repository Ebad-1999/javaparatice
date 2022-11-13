package day04nestedifswitch;

import java.util.Scanner;

public class day01NestedIfSwitch {
    public static void main(String[] args) {
    /* Ask user to enter a password

     If the initial of the password is uppercase
          Check if it is 'A' or not.
          If it is 'A' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

     If the initial of the password is lowercase
          Check if it is 'z' or not.
          If it is 'z' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid

     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");

        char pwdInitial = scan.next().charAt(0);//  charAt() method returns just single character, data type in java for single
                                          //characters is "char". because of that i used char data type for the pweInitial container.

       if (pwdInitial>='A'  && pwdInitial<='Z') {


            if (pwdInitial == 'A') {
                System.out.println("Valid password");
            } else {
                System.out.println("Valid password");
            }
            }else if (pwdInitial>='A'  && pwdInitial<='z'){
           if(pwdInitial=='z'){
               System.out.println("Valid password");

           }else {
               System.out.println("Invalid password");
           }
           }else{
                System.out.println("Invalid password");


       }










    }

}
