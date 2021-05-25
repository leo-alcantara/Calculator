package se.lexicon;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter your operator.");
        char operator = scanner.next().charAt(0);
        System.out.println("Please enter your second number.");
        double num2 = scanner.nextDouble();
        double result = 0;

        switch (operator) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '*':
                result = num1*num2;
                break;
            default:
                System.out.println( operator + " is not supported.");
        }

        //result = num1 + num2;
        System.out.println("Equals: " + result);
    }
}
