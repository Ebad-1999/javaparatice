package day32LambdaFP01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP01 {
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
        getMinGreaterThanSevenEvenNum(l);//8

        getHalfOfDistinctEleInReverseOrder(l);//[65.5, 5.0, 4.5, 4.0]



    }

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list){
        Integer min = list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min);
    }

    public static void getHalfOfDistinctEleInReverseOrder(List<Integer> list){
        List<Double> result = list.stream().
                distinct().
                filter(t-> t>5).
                map(t-> t/2.0).
                sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }



}
