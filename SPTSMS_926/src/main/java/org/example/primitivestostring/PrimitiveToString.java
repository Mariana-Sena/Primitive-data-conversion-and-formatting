package org.example.primitivestostring;

import java.util.Scanner;

public class PrimitiveToString {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean validInput;

            // Reading an integer
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter an integer value: ");
                    int intValue = scanner.nextInt();
                    String intString = Integer.toString(intValue);
                    System.out.println("Integer value as String: " + intString);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter a valid integer.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Reading a double
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter a double value: ");
                    double doubleValue = scanner.nextDouble();
                    String doubleString = Double.toString(doubleValue);
                    System.out.println("Double value as String: " + doubleString);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter a valid double.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Reading a float
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter a float value: ");
                    float floatValue = scanner.nextFloat();
                    String floatString = Float.toString(floatValue);
                    System.out.println("Float value as String: " + floatString);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter a valid float.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Reading a char
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter a single character: ");
                    String input = scanner.next();
                    if (input.length() == 1) {
                        char charValue = input.charAt(0);
                        String charString = Character.toString(charValue);
                        System.out.println("Character as String: " + charString);
                        validInput = true;
                    } else {
                        System.out.println("Error: Please enter a single character.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter a valid character.");
                }
            }

            // Reading a boolean
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter a boolean value (true/false): ");
                    boolean booleanValue = scanner.nextBoolean();
                    String booleanString = Boolean.toString(booleanValue);
                    System.out.println("Boolean value as String: " + booleanString);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter true or false.");
                    scanner.next(); // Clear the invalid input
                }
            }

            scanner.close();
        }
}



