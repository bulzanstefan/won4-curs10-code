package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

import static java.time.LocalDate.now;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;
import static ro.fasttrackit.curs10.homework.StringUtils.ensureNotEmpty;

public class Employee implements Person {
    private String name;
    private LocalDate birthday;
    private LocalDate dateOfEmployment;
    private String position;

    public Employee(String name, LocalDate birthday, LocalDate dateOfEmployment, String position) {
        setName(name);
        this.birthday = (birthday != null && birthday.isBefore(now()))
                ? birthday
                : now().minus(18, YEARS);
        this.dateOfEmployment = validateDateOfEmployment(dateOfEmployment, this.birthday);
        this.position = ensureNotEmpty(position);
    }

    public void moveEmploymentDate(int months) {
        this.dateOfEmployment = dateOfEmployment.plus(months, MONTHS);
    }

    public void setName(String name) {
        this.name = ensureNotEmpty(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthday;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    private LocalDate validateDateOfEmployment(LocalDate dateOfEmployment, LocalDate birthday) {
        if (dateOfEmployment != null && dateOfEmployment.minus(18, YEARS).isAfter(birthday)) {
            return dateOfEmployment;
        } else {
            return birthday.plus(18, YEARS);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", dateOfEmployment=" + dateOfEmployment +
                ", position='" + position + '\'' +
                '}';
    }
}
