package ru.skypro;

public class Main {

    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        if (firstName.isEmpty() || firstName.isBlank()) {
            System.out.println("Enter the first name.");
        } else if (middleName.isEmpty() || middleName.isBlank()) {
            System.out.println("Enter the middle name.");
        } else if (lastName.isEmpty() || lastName.isBlank()) {
            System.out.println("Enter the last name.");
        }
        else {
            System.out.println("fullName = " + fullName);
        }
    }
}

