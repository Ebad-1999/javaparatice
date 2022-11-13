package day27ExceptionCollection;


import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Mom");
        visitors.add("Ali");
        visitors.add("Ahmad");
        visitors.add("Shahudin");

        System.out.println(visitors);

        visitors.addLast("Kamel");
        System.out.println(visitors);

        visitors.addFirst("Salim");
        System.out.println(visitors);

        LinkedList<String> kids = new LinkedList<>();
        kids.add("Mazar");
        kids.add("Heart");

        System.out.println(kids);

        visitors.addAll(2, kids);
        System.out.println(visitors);

        visitors.add(2, "Miami");
        System.out.println(visitors);

        visitors.remove(3);
        System.out.println(visitors);

        visitors.remove("Mom");
        System.out.println(visitors);

        visitors.removeFirst();
        visitors.removeLast();
        System.out.println(visitors);

        visitors.remove();
        System.out.println(visitors);

       visitors.removeFirstOccurrence("Shahudin");
        System.out.println(visitors);




    }
}
