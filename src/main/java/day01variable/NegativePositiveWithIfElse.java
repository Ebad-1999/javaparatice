package day01variable;

import java.util.Scanner;

public class NegativePositiveWithIfElse {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("please enter you number");

        int num = input.nextInt();
        if (num<0){
            System.out.println(num+ " "+"is negative");
        }else if (num>0){

            System.out.println(num+ " "+" is positive number");
        }else if(num==0){
            System.out.println(num +" "+"is natural number");
        }else {
            System.out.println("you enter invalid number");
        }
    }
}
