package com.kaustav;

import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
        //Q: Take input of two numbers and print the sum
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is " + sum + '.');
    }
}