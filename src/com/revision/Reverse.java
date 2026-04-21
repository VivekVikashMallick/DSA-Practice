package com.revision;

public class Reverse {
    public static void main(String[] args) {
    //  1)   int n = 12345;
    //     int reverse = 0;

    //     while (n > 0) {
    //         int rem = n % 10; // Get the last digit
    //         reverse = reverse * 10 + rem; // Append the last digit to the reverse
    //         n = n / 10; // Remove the last digit
    //     }

    //     System.out.println("Reversed number: " + reverse);

        String str = "Hello";
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i); // Append characters in reverse order
        }

        System.out.println("Reversed string: " + reversedStr);
    }   
}
