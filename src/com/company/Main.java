package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("Josh");
        names.offer("Harry");
        names.offer("David");
        names.offer("George");
        //System.out.println(names.element());
        //System.out.println(names.peek());

        Deque<String> name = new ArrayDeque<>();
        name.addFirst("Josh");
        name.add("Dave");
        name.addLast("Paul");
        //System.out.println(name);

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("Nigeria", "Abuja");
        countries.put("USA", "Washington D.C.");
        countries.put("China", "Hong Kong");
        countries.put("Japan", "Tokyo");


        for (String country : countries.keySet()) {
            System.out.println("The capital of " + country + " is: " + countries.get(country));
        }
    }
}
