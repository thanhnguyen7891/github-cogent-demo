package com.cogent;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        //sum of element 0 to 14 and stores it at element 15,
        for (int i=0; i< 14; i++) {
            sum += A[i];
        }

        // identifies the smallest value from the array
        //and stores it at element 17
        for (int i=0; i< 14; i++) {
            if (minValue> A[i]) {
                minValue = A[i];
            }
        }
//        computes the
//        average and stores it at element 16
        double average = (double)sum / 14;
        A[15] = sum;
        A[16] = (int) average;
        A[17] = minValue;
        System.out.println("Original array: " + Arrays.toString(A));
    }
}
