package org.example.currencyformatting;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MonetaryValues {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a monetary value: ");
        double value = scanner.nextDouble();

        //used to create a specific instance for currency formatting.
        // Creates an instance of NumberFormat for formatting currency in the Brazilian standard format
        NumberFormat currancyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        //Formats the monetary value
        String valueFormatted = currancyFormat.format(value);

        System.out.println("Formatted value: " + valueFormatted);

        scanner.close();
    }
}

