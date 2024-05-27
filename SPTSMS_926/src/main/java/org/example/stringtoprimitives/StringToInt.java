package org.example.stringtoprimitives;

import java.util.Scanner;

public class StringToInt {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            String string = scanner.nextLine();
            try {
                int intValue = Integer.parseInt(string);
                System.out.println("The integer value is: " + intValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for an integer.");
            }

            scanner.close();
        }
    }



