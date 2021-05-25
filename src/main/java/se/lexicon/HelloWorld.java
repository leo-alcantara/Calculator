package se.lexicon;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        //Exercise 1
        //System.out.println("Hello");
        //System.out.println("Leo!");

        //Exercise 2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year.");
        short year= scanner.nextShort();
        if ((year % 400 ==0) || ((year % 4 ==0) && (year % 100 !=0))) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year.");
            }*/

        //Exercise 3
        /*int num1 = 45;
        int num2 = 11;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));*/

        //Exercise 4
        /*  int num1 = 23;
        int num2 = 11;
        int num3 = 77;
        int solution = (num1 + num2 + num3)/3;
        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ")/3 = " + solution);*/

        //Exercise 5
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name.");
        String yourName = scanner.next();
        System.out.println("Hello, " + yourName + "!");*/

        //Exercise 7
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int seconds = scanner.nextInt();
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.println(p2 + ":" + p3 + ":" + p1);*/

        //Exercise 8
        /*boolean guess = true;
        while (guess) {
            System.out.println("Guess a number between 1 and 500.");
            Scanner scanner = new Scanner(System.in);
            int guessedNumber = scanner.nextInt();

            int min = 1;
            int max = 500;
            int randomNumber = (int) Math.floor(Math.random() * (500) + 1);
            System.out.println(randomNumber);

            if (guessedNumber == randomNumber) {
                System.out.println("Congratulations! You are a genius!");
            } else if (guessedNumber < randomNumber) {
                System.out.println("The number you guessed is too low.");
            } else if (guessedNumber > randomNumber) {
                System.out.println("The number you guessed is too high.");
            } else {
                System.out.println();
                guess = false;

            }*/
        }
    }
