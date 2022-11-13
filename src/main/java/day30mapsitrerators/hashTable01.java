package day30mapsitrerators;

import java.util.Hashtable;

public class hashTable01 {

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 120000000);
        countryPopulations.put("Turkey", 100000000);
        countryPopulations.put("Denmark", 3000000);
        System.out.println(countryPopulations);



       Hashtable<String, Student> stdInfo = new Hashtable<>();

       stdInfo.put("Tom Hanks", new Student("enm@gmail.com", 15, 3, "American"));
        stdInfo.put("Brad Pitt", new Student("afm@gmail.com", 19, 1, "Peruvian"));
        stdInfo.put("Angeline Jolie", new Student("ssg@gmail.com", 21, 2, "English"));

        System.out.println(stdInfo);

        Student TomHanks  = stdInfo.get("Tom Hanks");
        System.out.println(TomHanks);
        System.out.println(TomHanks.age);
        System.out.println(TomHanks.email);
        System.out.println(TomHanks.grade);
        System.out.println(TomHanks.nationality);
    }
}
