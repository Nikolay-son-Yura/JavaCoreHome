package lesson4;

import java.time.LocalDate;

public class Customer {
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private Gender gender;

    public Customer(String lastName, String firstName, LocalDate birthDate, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Фамилия - " + lastName +
                ", Имя - " + firstName +
                ", Дата рождения - " + birthDate +
                ", пол - " + gender;
    }
}
