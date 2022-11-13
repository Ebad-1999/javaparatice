package day28Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);

        String el1 = wareHouse.poll();
        System.out.println(el1);
        System.out.println(wareHouse);

        String el2 = wareHouse.peek();
        System.out.println(el2);
        System.out.println(wareHouse);


        String el3= wareHouse.element();
        System.out.println(el3);
        System.out.println(wareHouse);

        Queue<String> emptyWarehouse = new LinkedList<>();
        String el4 = emptyWarehouse.peek();
        System.out.println(el4);

        boolean result = wareHouse.offer("Banana");
        System.out.println(result);
        System.out.println(wareHouse);

        String el7 = wareHouse.remove();
        System.out.println(el7);
        System.out.println(wareHouse);

        String el8 = wareHouse.poll();
        System.out.println(el8);
        System.out.println(wareHouse);
    }
}
