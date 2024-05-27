package org.example.datatype;

import java.util.Scanner;

public class Double {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Checking if radius is negative
        if (radius < 0) {
            System.out.println("Invalid value. The radius cannot be negative.");
        } else {
            double pi = 3.1416;
            double area = pi * radius * radius;

            System.out.println("The circle's area with radius " + radius + " is " + area);

            scanner.close();
        }
    }
}
//Na execução de valores quebrados, utilize vírgula
//A diferença entre float e double é a precisão, ou seja, o número de casas decimais que cada um consegue
// suportar. O float tem uma precisão de 6 casas decimais e o double tem uma precisão de 10 casas decimais.
