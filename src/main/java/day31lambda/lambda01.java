package day31lambda;

import java.util.ArrayList;
import java.util.List;

public class lambda01 {

    public static void main(String[] args) {

        List<Integer> l = new  ArrayList<>();

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);


        /*
        printElement(l);//8 9 131 10 9 10 2 8
        System.out.println();
        pintEvenElement(l);// 10 10 2 8
        System.out.println();
        printSquareOfOddElement(l);//81 17161 81


         */

        printCubOfDistinctElements(l);//729 2248091
        System.out.println();
        sumOfSquaresDistinctEvenElements(l);

    }

     /*
    public static void printElement(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));

    }

    public static void  pintEvenElement(List<Integer> list){
        list.stream().filter(t -> t%2==0).forEach(t-> System.out.print(t+" "));
    }

    public static void printSquareOfOddElement(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t->  t*t).forEach(t-> System.out.print(t+" "));
    }

      */

    public static void printCubOfDistinctElements(List<Integer> list){

        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));

    }

    public static void sumOfSquaresDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t, u)-> t+u);
        System.out.println(sum);
    }





}
