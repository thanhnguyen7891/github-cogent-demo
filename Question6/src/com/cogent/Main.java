package com.cogent;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "This is a string";

        //length of string
        int strLength = str.length();
        System.out.println("The length of string is: " + strLength);

        //string to uppercase
        String strUpper = str.toUpperCase();
        String strLower = str.toLowerCase();
        System.out.println("Uppercase string: " + strUpper);
        System.out.println("Lowercase string: " + strLower);

        //check if string is palindrome
        if (isPalindrome(str)){
            System.out.println(str +" is palindrome");
        }
        else {
            System.out.println(str +" is not palidrome");
        }
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()- 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                left++;
                right--;
                return false;
            }
        }
        return true;
    }
}

