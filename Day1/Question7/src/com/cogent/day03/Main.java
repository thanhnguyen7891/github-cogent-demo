package com.cogent.day03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;

        System.out.println("The first number is: " +a);
        System.out.println("The second number is: " +b);

        System.out.print("the sequence: " +a + " " +b+" " );
        for (int i = 0; i < 13; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
