package com.example;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + calc.add(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));

        scanner.close();
    } // <-- main() closes HERE, before other methods begin

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b; // <-- Added missing return statement
    }
}
