package day33Lambda;

import java.util.stream.IntStream;

public class lambdainStreamUsage {

    public static void main(String[] args) {

        System.out.println(getSumFromSevenToHundred01());//5029
        System.out.println(getSumFromSevenToHundred02());//5029
        System.out.println(getMultiplicationFromTwoToEleven());////39916800

    }

    //Create a method to fine the sum of the Integers from 7 to 100.
    //1.way: IntStream.range (7, )==> has the same functionality with for-loop in structured programming
    public static int getSumFromSevenToHundred01(){
        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }

    //2.way
    public static int getSumFromSevenToHundred02(){
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);

    }

    //2)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).
    public static int getMultiplicationFromTwoToEleven(){
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }


}
