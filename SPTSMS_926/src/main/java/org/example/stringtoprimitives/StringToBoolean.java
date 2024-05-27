package org.example.stringtoprimitives;

import java.util.Scanner;

public class StringToBoolean {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a boolean value (true/false): ");
            String string = scanner.nextLine();
            boolean booleanValue = Boolean.parseBoolean(string);
            System.out.println("The boolean value is: " + booleanValue);

            scanner.close();
        }
}
