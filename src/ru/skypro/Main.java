package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        String fullNameForTheAdminsDepartment = middleName + ";" + firstName + ";" + lastName;;
        System.out.println("Full name for the administrative department - " + fullNameForTheAdminsDepartment);
        String fullName2 = "Ivanov Ivan Ivanovich";
        String fullNameForTheAdminsDepartment2 = fullName2.replace(" ", ";");
        System.out.println("Full name for the administrative department (version2) - " + fullNameForTheAdminsDepartment2);

    }
    }


