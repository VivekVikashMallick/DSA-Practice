package com.revision;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // 1) char ch = sc.next().trim().charAt(0);

        // System.out.println(ch);

    //   2)
    //     String word = "Manish";
    //     System.out.println(word.charAt(3));

        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not an alphabet");
        }
        

        sc.close();
    }
}
