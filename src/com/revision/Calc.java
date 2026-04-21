package com.revision;

import java.util.Scanner;

public class Calc {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    


    // while (true) {
    //     System.out.println("Enter two numbers: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Enter an operator (+, -, *, /): ");
    //     char operator = sc.next().charAt(0);

    //     double result;

    //     switch (operator) {
    //         case '+':
    //             result = a + b;
    //             break;
    //         case '-':
    //             result = a - b;
    //             break;
    //         case '*':
    //             result = a * b;
    //             break;
    //         case '/':
    //             if (b != 0) {
    //                 result = (double) a / b;
    //             } else {
    //                 System.out.println("Error: Division by zero is not allowed.");
    //                 continue; // Skip the rest of the loop and start over
    //             }
    //             break;
    //         default:
    //             System.out.println("Invalid operator. Please try again.");
    //             continue; // Skip the rest of the loop and start over
    //     }

    //     System.out.println("Result: " + result);
          int res = 0;
        while(true){
            System.out.println("Enter the operator:");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if(op == '+'){
                    res = a+b;
                }else if(op == '-'){
                    res = a-b;
                }else if(op == '*'){
                    res = a*b;
                }else if(op == '/'){
                    if(b != 0){
                        res = a/b;
                    }else{
                        System.out.println("Error: Division by zero is not allowed.");

                         }

                    }
                    else if( op == 'x' || op == 'X'){
                        break;
                    }else{
                System.out.println("Invalid operator. Please try again.");
                    
                 
                
            }
            
              }
              System.out.println(res);
              sc.close();
          
        }
        
    }
}



