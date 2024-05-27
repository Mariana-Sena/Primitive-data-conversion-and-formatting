package org.example.datatype;

import java.util.Scanner;

public class Int { //Factorial using Int

        public static void main(final String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to calculate the factorial: ");
            int num = scanner.nextInt();

            //Checking if num is negative
            if (num < 0) {
                System.out.println("Invalid number. Factorial is not defined to negative numbers.");
            } else {
                long result = 1;  // Using long to avoid overflow during calculation

                for (int i = 1; i <= num; i++) {
                    result *= i;
                    // Checks if the result is still in the range of type int
                    if (result > Integer.MAX_VALUE) {
                        System.out.println("The factorial of " + num + " is too big to be calculated using int type.");
                        scanner.close();
                        return;
                    }
                }

                // If the result is still within the int type range, convert it to int to display the result
                System.out.println("The factorial " + num + " is " + (int) result);
            }

            scanner.close();
        }
    }

//The size of int is 32 bits, that is, it covers values between -2,147,483,648 to 2,147,483,647.
