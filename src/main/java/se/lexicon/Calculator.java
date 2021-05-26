package se.lexicon;

import java.util.Scanner;

public class Calculator {


        public static void main(String[] args) {

            boolean calculate = true;
            while (calculate) {
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
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    default:
                        System.out.println(operator + " is not supported.");
                }

                System.out.println("Your calculation equals: " + result);

                System.out.println("Do you want to continue (y/n)");
                char test = scanner.next().charAt(0);

                if (test == 'n'){
                    calculate = false;
                } else if (test == 'y') {
                    calculate = true;
                } else {
                    System.out.println("Your choice is not a valid. Please choose (y/n).");
                }
            }
            System.out.println("DONE.");



            }
        }



