package org.example.datatype;

import java.util.Scanner;

public class Float {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the temperature in degrees Celsius: ");
            float celsius = scanner.nextFloat();

            float fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(celsius + " degrees Celsius is the same as " + fahrenheit + " degrees Fahrenheit.");

            scanner.close();
        }
    }