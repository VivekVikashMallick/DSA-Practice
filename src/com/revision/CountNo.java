package com.revision;

import java.util.Scanner;

public class CountNo {
    public static void main(String[] args) {
        // 1) This will find the no .of digits in a number.
        // int n = 12345;
        // int count = 0;

        // while (n > 0) {
        //     n = n / 10; // Remove the last digit
        //     count++; // Increment the count
        // }

        // System.out.println("Number of digits: " + count);

      // 2) This will count the occurrences of a specific digit in a number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0 ){
            int rem = n % 10; // Get the last digit
            if(rem == 3) {
                count++;
            }
         n = n / 10; // Remove the last digit
        }
        System.out.println("Count of 3: " + count);
        sc.close();
  }
    
}
