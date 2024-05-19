package lesson4;

import java.time.LocalDate;

enum Holiday {
    noHoliday,
    newYear,
    internationalWomenDay,
    defendersDay
}

public class Program {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Викторов", "Николай", LocalDate.of(1987, 9, 6), Gender.MALE);
        Customer customer2 = new Customer("Иванов", "Федор", LocalDate.of(1980, 11, 25), Gender.MALE);
        Customer customer3 = new Customer("Андреева", "Александра", LocalDate.of(1990, 2, 17), Gender.FEMALE);
        Customer customer4 = new Customer("Байраковский", "Станислав", LocalDate.of(1986, 5, 11), Gender.MALE);
        Customer[] customers = {customer1, customer2, customer3, customer4};
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
        System.out.println("++++++++");
        congratulateCustomers(customers, Holiday.noHoliday);
        System.out.println("++++++++");
        congratulateCustomers(customers, Holiday.newYear);
        System.out.println("++++++++");
        congratulateCustomers(customers, Holiday.internationalWomenDay);
        System.out.println("++++++++");
        congratulateCustomers(customers, Holiday.defendersDay);
    }

    private static void congratulateCustomers(Customer[] customers, Holiday holiday) {
        for (Customer customer : customers) {
            if (holiday == Holiday.newYear) {
                System.out.println("С Новым Годом, " + customer.getFirstName() + "!");
            } else if (holiday == Holiday.internationalWomenDay && customer.getGender().equals(Gender.FEMALE)) {
                System.out.println("С 8 Марта, " + customer.getFirstName() + "!");
            } else if (holiday == Holiday.defendersDay && customer.getGender().equals(Gender.MALE)) {
                System.out.println("С 23 Февраля, " + customer.getFirstName() + "!");
            } else if (holiday == Holiday.noHoliday) {
                System.out.println("Сегодня не праздничный день");
                break;
            }
        }
    }
}
