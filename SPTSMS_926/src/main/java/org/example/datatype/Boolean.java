package org.example.datatype;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boolean {

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer number: ");

            try {
                int num = scanner.nextInt();
                boolean isEven = num % 2 == 0;

                if (isEven) {
                    System.out.println("The number " + num + " is even.");
                } else {
                    System.out.println("The number " + num + " is odd.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please, enter an integer number.");
            }

            scanner.close();
        }
    }




