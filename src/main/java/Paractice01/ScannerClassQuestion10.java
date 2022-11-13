package Paractice01;

import java.util.Scanner;

public class ScannerClassQuestion10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your full name and address");
        String full = scan.nextLine();
        String add = scan.nextLine();
        System.out.println("Your full name is"+" "+full);
        System.out.println("Your address is"+" "+add);

    }
}
