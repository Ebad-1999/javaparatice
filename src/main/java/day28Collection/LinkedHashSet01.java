package day28Collection;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSet01 {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Mango");
        emails.add("Fig");
        emails.add("Mango");

        System.out.println(emails);

        emails.remove("Fig");
        System.out.println(emails);

        //emails.clear();
        //System.out.println(emails);

        Object emails2 = emails.clone();
        System.out.println(emails2);

        HashSet<String> emails3 = (HashSet<String>) emails.clone();
        System.out.println(emails3);

        //LinkedHashset
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);

        System.out.println(ssn);

        //ThreeSet
        Long starting = LocalTime.now().toNanoOfDay();

        TreeSet<Integer> nums1= new TreeSet<>();
        nums1.add(5);
        nums1.add(15);
        nums1.add(-6);
        nums1.add(351);
        nums1.add(28);
        System.out.println(nums1);


        Long Middle = LocalTime.now().toNanoOfDay();


        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(5);
        nums2.add(25);
        nums2.add(67);
        nums2.add(66);
        nums2.add(-5);
        Set<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);//[ -5, 5, 17, 23, 41, 67]

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("Way1:"+(Middle-starting));
        System.out.println("Way2:"+(ending-Middle));









    }
}
