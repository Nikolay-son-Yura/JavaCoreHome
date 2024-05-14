import lesson2.task1;
import lesson2.task2;
import lesson2.task3;
import lesson3.Director;
import lesson3.Employees;

import java.time.LocalDate;
import java.util.Arrays;

import static lesson3.Employees.birthDateComparator;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {2, 1, 2, 0, 0, 3, 0, 4};
//        task1.numberOfEvenElements(arr);
//        task2.differenceBetweenMaxAndMin(arr);
//        System.out.println(task3.zeroEliminations(arr));

        Employees employee1 = new Employees("Middle-Програмист", "Иванов", "Федор", LocalDate.of(1980, 11, 25), 100000);
        Employees employee2 = new Employees("Junior-Программист", "Викторов", "Николай", LocalDate.of(1987, 9, 6), 95000);
        Employees employee3 = new Employees("Senior-Програмист", "Андреева", "Александра", LocalDate.of(1990, 2, 17), 115000);
        Director director = new Director("Руководитель отдела", "Байраковский", "Станислав", LocalDate.of(1986, 5, 11), 200000);

        Employees[] employees = {employee1, employee2, employee3, director};

        for (Employees employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println();
        if (birthDateComparator().compare(employee2, employee3) < 0) {
            System.out.println(employee2.getFirstName() + " старше, чем " + employee3.getFirstName());
        } else if (birthDateComparator().compare(employee2, employee3) > 0) {
            System.out.println(employee2.getFirstName() + " младше, чем " + employee3.getFirstName());
        } else {
            System.out.println(employee2.getFirstName() + " и " + employee3.getFirstName() + " родились в один день");
        }
        System.out.println();


        for (Employees employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
        }
        Director.salaryIncreases(employees, 12);
        System.out.println();
        System.out.println("После повышения зарплаты");
        System.out.println();
        for (Employees employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
        }

    }
}