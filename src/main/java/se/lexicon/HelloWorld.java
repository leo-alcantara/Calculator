package se.lexicon;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[]args){
        //System.out.println("Hello");
        //System.out.println("Leo!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter your second number");
        int num2 = scanner.nextInt();
        int result = 0;

        result = num1 + num2;
        System.out.println(result);
    }
}
