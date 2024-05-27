package org.example.stringtoprimitives;

import java.util.Scanner;

public class StringToChar {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a single character: ");
            String charString = scanner.nextLine();
            if (charString.length() == 1) {
                char charValue = charString.charAt(0);
                System.out.println("The char value is: " + charValue);
            } else {
                System.out.println("Invalid entry for a char. Must be a single character.");
            }

            scanner.close();
        }
}
