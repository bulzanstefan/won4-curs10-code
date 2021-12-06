package ro.fasttrackit.curs10.objectMethods;

public class Main {

    public static void main(String[] args) {
        Object p = new Person("Ana");

        System.out.println(p.equals("test"));
        System.out.println(p.equals(new Person("Ana")));
        System.out.println(p.equals(new Person("Bogdan")));
        System.out.println(p.toString());
        System.out.println(p.getClass());
        System.out.println(p.hashCode());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object other) {
        System.out.println("Se apeleaza equals");
        if (other == this) {
            return true;
        }
        if (!other.getClass().equals(this.getClass())) {
            return false;
        }
        Person otherPerson = (Person) other;
        return otherPerson.name.equals(this.name);
    }
}