package com.cogent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 23;
        arr[2] = 21;
        arr[3] = 34;
        arr[4] = 13;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while(n1< 1 || n1 >40 || n2 <1 || n2>40) {
            System.out.println("Please Re-enter number from 1-40: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == n1) {
                for (int a = 0; a < arr.length; a++) {
                    if (arr[a] == n2) {
                        System.out.println("BINGO");
                    }
                }
            }
        }
    }
}
