package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

import static ro.fasttrackit.curs10.homework.StringUtils.ensureNotEmpty;

public class Programmer extends Employee {
    private String language;

    public Programmer(String name, LocalDate birthday, LocalDate dateOfEmployment, String language) {
        super(name, birthday, dateOfEmployment, "programmer");
        this.language = ensureNotEmpty(language);
    }

    public String getLanguage() {
        return language;
    }
}
