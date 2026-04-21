package com.revision;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // int n = 10; // Number of Fibonacci numbers to generate
        // int a = 0, b = 1;

        // System.out.println("Fibonacci Series up to " + n + " terms:");
        // for (int i = 1; i <= n; i++) {
        //     System.out.print(a + " ");
        //     int next = a + b;
        //     a = b;
        //     b = next;
        // }

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int a = 0, b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            
            count++;
        }
        System.out.println(b);

        sc.close();
    }   
}
