package org.example.stringtoprimitives;

import java.util.Scanner;

public class StringToFloat {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a float number: ");
            String string = scanner.nextLine();
            try {
                float floatValue = Float.parseFloat(string);
                System.out.println("The float value is: " + floatValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for a float: ");
            }

            scanner.close();
        }
}
