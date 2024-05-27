package org.example.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatting3 {

    public static void main(final String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("en", "US"));
        String dateFormatted = date.format(formatter);
        int day = date.getDayOfMonth();
        String sufix;

        switch (date.getDayOfMonth()) {
            case 1: case 21: case 31:
                sufix = "st";
                break;
            case 2: case 22:
                sufix = "nd";
                break;
            case 3: case 23:
                sufix = "rd";
                break;
            default:
                sufix = "th";
        }

        String daySufix = day + sufix;
        String dateSufix = dateFormatted.replaceFirst(String.valueOf(day), daySufix);

        System.out.println("Formatted date: " + dateSufix + ".");
    }
}

