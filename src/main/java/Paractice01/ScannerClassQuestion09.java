package Paractice01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClassQuestion09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your first name and last name");
        String first = scan.nextLine();
        String last = scan.nextLine();
        System.out.println("Your name is"+" "+first+" "+last);

    }
}
