package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            String fullName2 = fullName.replace('ё', 'е');
            System.out.println("fullName = " + fullName2);
        } else {
            System.out.println("fullName = " + fullName);
        }
    }
    }


