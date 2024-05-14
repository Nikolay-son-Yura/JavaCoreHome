package lesson3;

import java.time.LocalDate;
import java.util.Comparator;

public class Employees {
    private String post;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private double salary;

    public Employees(String post, String lastName, String firstName, LocalDate birthDate, double salary) {
        this.post = post;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static Comparator<Employees> birthDateComparator() {
        return Comparator.comparing(employee -> employee.birthDate);
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "Должность = '" + getPost() + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Дата рождения=" + birthDate +
                ", Зарплата=" + salary;
    }
}
