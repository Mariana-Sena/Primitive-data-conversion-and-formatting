package org.example.stringtoprimitives;

import java.util.Scanner;

public class StringToDouble {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a double number: ");
            String string = scanner.nextLine();

            try {
                double doubleValue = Double.parseDouble(string);
                System.out.println("The double value is: " + doubleValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for a double.");
            }

            scanner.close();
        }
}

