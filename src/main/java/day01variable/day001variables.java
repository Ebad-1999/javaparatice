package day01variable;

public class day001variables {
    public static void main(String[] args) {


        //Data type         variable    =        value     ;
           int                 age      =         27       ;
           //Example create a variable whose value is 1.9
        double d =1.9;

                                     //Data types

        /*
            1)integer: It is used for whole numbers.
            The minimum value of integers is -2,147,483,648
            The maximum value of integers is 2,147,483,647
            integer variables use 32 bits in memory

            2)short: It is used for whole numbers.
            The minimum value of shorts is -32,768
            The maximum value of shorts is 32,767
            short variables use 16 bits in memory

            3)byte: It is used for whole numbers.
            The minimum value of byte is -128
            The maximum value of byte is 127
            byte variables use 8 bits in memory

            4)long: It is used for whole numbers.
            The minimum value of long is -9,223,372,036,854,755,808
            The maximum value of long is 9,223,372,036,854,755,807
            long variables use 64 bits in memory

            Note: When you select any data type the value must be in the range of the data type

         */

        int population = 700000000;
        System.out.println("populationOfGermany");

        long l = 8000000000L;

        //Note Java accepts long value a intrger as defult. But if your value is greater than the maximum value of integer
       // you will get error.to fix that error you have to put "L" or "l" to the end of the number.
       long populationOfTheWorld = 70000000000L;
       long populationOFIndia = 1400000;

       byte ageOfStudent = 27;
        System.out.println(ageOfStudent);

        short populationOfTheVillage = 23000;
        System.out.println(populationOfTheVillage);
        /*
        String is a "Non-Primitive Data Type"

        What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?
                1)"Primitive Data Types" have just value but "Non-Primitive Data Types" have values and methods
        2)"Primitive Data Types" were created by Java, we cannot create any Primitive Data Type.
        But we can create Non-Primitive Data Types whenever we need
        3)"Primitive Data Types" use just lower cases in their names
        But Non-Primitive Data Types starts with upper cases
        4)Usage of memory in "Primitive Data Types" changes from data type to data type
        But all Non-Primitive Data Types use same amount of memory
                */
        String name = "Tom Hanks";

        /*
                         Memory Usage in Java
             There are two types of memory
             1)Stack Memory: Stores i)Primitive Data  ii)References(Addresses) of Non-Primitive Data
             2)Heap Memory: Stores non-primitive data
         */

        //Example 1: Create one integer variable, and 2 double variables then print their sum on the console
        //Note:If you use different numeric data
        int shirt = 21;
        double shoes = 12.99, socks = 3.99;
        System.out.println(shirt + shoes + socks);


        //Example 3: Create 2 float variables, 3 short variables, 2 double variables and print their sum on the console.
        //Example 3: Create 2 float variables, 3 short variables, 2 double variables and print their sum on the console.
        float f1 = 12.99F, f2 = 5.76F;
        short s1 = 12, s2 = 23, s3 = 34;
        double d1 = 23.45, d2 = 123.09;

        System.out.println(f1 + f2 + s1 + s2 + s3 + d1 + d2);//234.29

        //Example 4: Create a char variable and an integer variable and try to do addition operation with them
        char  c1 = 'A';
        int   i1 = 10;
        //When you use any char in any math operation Java uses the ASCII valus of the char
        System.out.println(c1 + i1);//75


        //Example 5: Create a String variable and 2 integer variables and try to do addition operation with them

        String s = "Tom";
        int i = 12, k = 23;
        System.out.println(s + i +k );//Tom1223

         //What if I want to see Tom35
        System.out.println(s + (i+k));

          //If you use "+" sign with a String, Java will do "concatenation" operation.
          //In concatenation operation data will be joined










    }
}
