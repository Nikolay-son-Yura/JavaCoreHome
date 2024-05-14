package lesson3;

import java.time.LocalDate;

public class Director extends Employees {


    public Director(String post, String lastName, String firstName, LocalDate birthDate, double salary) {
        super(post, lastName, firstName, birthDate, salary);
    }

    public static void salaryIncreases(Employees[] employees, double percent) {
        for (Employees employee : employees) {
            if (!(employee instanceof Director)) {
                employee.setSalary(employee.getSalary() * (1 + percent / 100));
            }
        }

    }


}
