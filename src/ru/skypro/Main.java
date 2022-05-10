package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        String fullNameForTheReport = fullName.toUpperCase();
        System.out.println("Full name for the report - " + fullNameForTheReport);
    }
    }


