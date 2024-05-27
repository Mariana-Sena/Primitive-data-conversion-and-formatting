package org.example.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatting2 {

    public static void main(final String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        String dateForrmatted = date.format(formatter);
        System.out.println("Formatted date: " + dateForrmatted);
    }
}

