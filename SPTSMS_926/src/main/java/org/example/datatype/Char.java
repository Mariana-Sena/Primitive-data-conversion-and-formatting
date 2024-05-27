package org.example.datatype;

import java.util.Scanner;

public class Char {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char character = scanner.next().charAt(0);

            if (Character.isUpperCase(character)) {
                System.out.println("The character " + character + " is an uppercase letter.");
            } else if (Character.isLowerCase(character)) {
                System.out.println("The character " + character + " is a lowercase letter.");
            } else {
                System.out.println("The character " + character + " is not a letter.");
            }

            scanner.close();
        }
    }
