package com.revision;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // int a = 10, b = 20, c = 15;
        // int largest;
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int largest;

        // if (a >= b && a >= c) {
        //     largest = a;
        // } else if (b >= a && b >= c) {
        //     largest = b;
        // } else {
        //     largest = c;
        // }

        // System.out.println("The largest number is: " + largest);
        System.out.println("Enter three numbers: ");
        @SuppressWarnings("unused")
        int a = sc.nextInt();
        @SuppressWarnings("unused")
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = Math.max (c, Math.max(0, 0));

        System.out.println("The largest number is: " + max);

        sc.close();
    }
}
 