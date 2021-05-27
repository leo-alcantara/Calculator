package se.lexicon;

import java.util.Scanner;

public class Calculator {

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        boolean calculate = true;
        while (calculate) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first number.");
            double num1 = scanner.nextDouble();
            System.out.println("Please enter your operator: +, -, *, or / .");
            char operator = scanner.next().charAt(0);
            System.out.println("Please enter your second number.");
            double num2 = scanner.nextDouble();
            double result = 0;

            switch (operator) {
                case '+':
                    result = addition(num1, num2);
                    break;
                case '-':
                    result = subtraction(num1, num2);
                    break;
                case '/':
                    result = division(num1, num2);
                    break;
                case '*':
                    result = multiplication(num1, num2);
                    break;
                default:
                    System.out.println(operator + " is not supported.");
            }

            System.out.println("Your calculation equals: " + result);

            boolean answer = true;
            while (answer) {
                System.out.println("Do you want to continue? Push (y) for yes or (n) for no.");
                char test = scanner.next().charAt(0);
                if (test == 'n') {
                    answer = false;
                    calculate = false;
                }
                if (test == 'y') {
                    answer = false;
                    calculate = true;
                }
                if (test != 'y' && test != 'n') {
                    System.out.println("Your choice is not valid. Please choose (y/n).");
                    answer = true;
                    calculate = true;
                }
            }
            System.out.println("Thank you for using our calculator.");
        }
    }
}


