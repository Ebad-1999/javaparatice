package ITJava;

import java.util.Scanner;

public class Taxt {

    public static void main(String[] args) {


        String str="      java is easy     ";

        System.out.println(str.toUpperCase());

        String upp = str.toUpperCase();
        System.out.println(upp);
         boolean st= str.contains("!");
        System.out.println(st);
        System.out.println(str.trim());

        System.out.println(str.replaceAll("java","Html"));


    }
}
