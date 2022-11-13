package day32LambdaFP01;

import java.util.ArrayList;
import java.util.List;

public class LambdaFP02 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementsFunctional(l);//8 9 131 10 9 10 2 8
        System.out.println();
        printEvenElementsStructure(l);
        System.out.println();
        printCubOfDistinctOddElements(l);


    }

    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    public static void printEvenElementsStructure(List<Integer> list){
        list.stream().filter(UtilsClass::checkToBEEven).forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    public static void printCubOfDistinctOddElements(List<Integer> list){
        list.stream().distinct().
                filter(UtilsClass::checkToBEOdd).
                map(UtilsClass::getCub).
                forEach(UtilsClass::printInTheSameLineWithTheSpace);

    }

}
