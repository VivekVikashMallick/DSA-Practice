package com.revision;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //old way of writing switch case
        // int day = 3;
        // String dayName;

        // switch (day) {
        //     case 1:
        //         dayName = "Monday";
        //         break;
        //     case 2:
        //         dayName = "Tuesday";
        //         break;
        //     case 3:
        //         dayName = "Wednesday";
        //         break;
        //     case 4:
        //         dayName = "Thursday";
        //         break;
        //     case 5:
        //         dayName = "Friday";
        //         break;
        //     case 6:
        //         dayName = "Saturday";
        //         break;
        //     case 7:
        //         dayName = "Sunday";
        //         break;
        //     default:
        //         dayName = "Invalid day";
        // }

        int month = 4;
        String monthName;

        switch (month) {
            case 1, 2, 3 -> monthName = "Winter";
            case 4, 5, 6 -> monthName = "Spring";
            case 7, 8, 9 -> monthName = "Summer";
            case 10, 11, 12 -> monthName = "Autumn";
            default -> monthName = "Invalid month";
        }
        System.out.println("Month: " + monthName);
        sc.close();

    }
}