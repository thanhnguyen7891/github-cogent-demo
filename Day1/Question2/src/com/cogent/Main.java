package com.cogent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Tasks = new ArrayList();
        System.out.print("Please enter your name: ");
        String name = sc.next();

        System.out.println("Please enter your task: ");
        String input = sc.next();

        Tasks.add(input);
        while() {
            input = sc.next();
            Tasks.add(input);
        }
        System.out.println(Tasks);







    }
}
