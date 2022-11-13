package day30mapsitrerators;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMap01 {

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 120000000);
        countryPopulations.put("Turkey", 100000000);
        countryPopulations.put("Denmark", 3000000);
        System.out.println(countryPopulations);

        Map.Entry<String, Integer> dataOfCeiling = countryPopulations.ceilingEntry("M" );
        System.out.println(dataOfCeiling);

        NavigableSet<String > descendingKeySet = countryPopulations.descendingKeySet();
        System.out.println(descendingKeySet);

        Map.Entry<String, Integer> floorEntry = countryPopulations.floorEntry("Germany");
        System.out.println(floorEntry);

        Map.Entry<String, Integer> lowerEntry = countryPopulations.lowerEntry("Germany");
        System.out.println(lowerEntry);

        NavigableMap<String,Integer> subMap1 = countryPopulations.subMap("Denmark", false, "USA", true);
        System.out.println(subMap1);


    }
}
