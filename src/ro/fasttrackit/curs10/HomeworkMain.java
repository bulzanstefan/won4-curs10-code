package ro.fasttrackit.curs10;

import ro.fasttrackit.curs10.homework.DatabaseAdmin;
import ro.fasttrackit.curs10.homework.Employee;
import ro.fasttrackit.curs10.homework.Person;
import ro.fasttrackit.curs10.homework.Programmer;

import java.time.LocalDate;


public class HomeworkMain {
    public static void main(String[] args) {
        Person andrei = new Employee(
                "Andrei",
                LocalDate.of(1999, 5, 2),
                LocalDate.of(2018, 1, 2),
                "intern");

        Person beni = new Programmer(
                "Beni",
                LocalDate.of(1990, 6, 3),
                LocalDate.of(2015, 5, 6),
                "Java");

        Employee ana = new DatabaseAdmin(
                "Ana",
                LocalDate.of(1994, 6, 7),
                LocalDate.of(2013, 7, 7),
                "SQL"
        );

        printPersonDetails(andrei);
        printPersonDetails(beni);
        printPersonDetails(ana);
    }

    private static void printPersonDetails(Person person) {
        if (person.getBirthday().getYear() > 1993) {
            System.out.println("hello " + person);
        } else {
            System.out.println("old " + person);
        }
    }
}
