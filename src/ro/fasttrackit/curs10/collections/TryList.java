package ro.fasttrackit.curs10.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TryList {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bogdan");
        names.add("Bogdan");
        names.add("Bogdan");
        names.add("Bogdan");
        names.add("Bogdan");
        System.out.println(names);
        names.remove("Ana");
        System.out.println(names);
        names.addAll(List.of("Marcel", "Mirela", "Daria", "Paul"));
//        for (int i = 0; i < 10_000_000; i++) {
//            names.add("Marcel " + i);
//        }
//        System.out.println(names);
//        System.out.println(names.get(3));
//        System.out.println(names.contains("Bogdan"));
//        System.out.println(names.contains("Ana"));
//        names.remove(3);
//        System.out.println(names);
//        System.out.println(names.size());
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("----");
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//
//        names.set(3, "Monica"); //names[3]="Monica"
//        System.out.println(names);
//        System.out.println(names);
    }
}
