package org.example.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatting1 {

    public static void main(final String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTimeFormatted = dataHora.format(formatter);
        System.out.println("Formatted date and time: " + dateTimeFormatted);
    }
   }
