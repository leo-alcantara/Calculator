package se.lexicon;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int num1 = scanner.nextInt();
        System.out.println("Please enter your operator.");
        char operator = scanner.next().charAt(0);
        System.out.println("Please enter your second number.");
        int num2 = scanner.nextInt();
        int result = 0;

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
