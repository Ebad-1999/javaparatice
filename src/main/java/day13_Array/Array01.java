package day13_Array;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        String names []=new String[4];
        System.out.println(Arrays.toString(names));
        names[0]="Ahmad";
       names[1]="Mhmood";
        names[2]="sahms";
        names[3]="Ajmal";

        System.out.println(Arrays.toString(names));



        //Example 1: Create an integer array and print the sum of the first and the last on the console

        int age[]=new int[5];
        System.out.println(Arrays.toString(age));

        age[0]=30;
        age[1]=40;
        age[2]=22;
        age[3]=21;
        age[4]=12;


        System.out.println(Arrays.toString(age));
        System.out.println(age[0]+age[4]);
        System.out.println(age[0]+age[age.length-1]);







    }
}
