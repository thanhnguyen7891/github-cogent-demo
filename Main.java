package com.cogent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n = sc.nextInt();
        int even = 0;
        while(even <= n){
            System.out.println("The even number is: "+ even);
            even +=2;
        }
        int odd = 1;
        while(odd <= n){
            System.out.println("The odd number is: "+odd);
            odd +=2;
            }

    }
}
