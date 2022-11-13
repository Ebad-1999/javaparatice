package Paractice01;

import java.util.Scanner;

public class ScannerClassQuestion08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the exact hour");

        long hour = input.nextLong();

        System.out.println("It is Equal to" + " "+ hour*3600+" "+"second");

    }
}
