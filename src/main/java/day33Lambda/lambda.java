package day33Lambda;

import day32LambdaFP01.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class lambda {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tom");
        l.add("Ben");

        printInUpperCase(l);
        System.out.println();
        printInUpperCase01(l);
        System.out.println();
        printEleSortedByLength(l);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    //1)Create a method to print all list elements in uppercase.
    public static void printInUpperCase(List<String> list){
        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }
    public static void printInUpperCase01(List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    //2) Create a method to print the elements after ordering according to their lengths
    public static void printEleSortedByLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void printSortedByLengthAndSortedByInitial(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing())
    }

}
