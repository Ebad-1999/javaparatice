package day01variable;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the width and height of rectangle");
        int width= scan.nextInt();
        int height= scan.nextInt();
        System.out.println("The area of rectangles : "+ width*height);
        System.out.println("The pre meter of rectangles : "+ 2*(width*height));
    }
}
