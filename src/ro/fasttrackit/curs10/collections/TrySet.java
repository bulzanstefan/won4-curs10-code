package ro.fasttrackit.curs10.collections;

import java.util.*;

public class TrySet {
    public static void main(String[] args) {
        Set<String> shopping = new LinkedHashSet<>();
        shopping.add("lapte");
        shopping.add("paine");
        shopping.add("abecedar");
        shopping.add("lapte");
        shopping.add("lapte");

        System.out.println(shopping);

        for (String item : shopping) {
            System.out.println(item);
        }

        Iterator<String> iterator = shopping.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        shopping.remove("lapte");
        System.out.println(shopping);
    }
}
