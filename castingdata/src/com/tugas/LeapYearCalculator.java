package com.tugas;

import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args) {

        int day = 0;
        int month, year;

        System.out.print("Month : ");
        Scanner scanMonth = new Scanner(System.in);
        month = scanMonth.nextInt();

        if (month < 1 || month >12){
            System.out.println("Invalid input");
        } else {
            int isEven = month%2;
            switch(isEven){
                case 0: day = 30;
                    break;
                case 1: day = 31;
                    break;
            }
            System.out.print("Year : ");
            Scanner scanYear = new Scanner(System.in);
            year = scanYear.nextInt();
            System.out.println();
            if(year%4 == 0 && year%100 != 0){
                System.out.println(year + " is a leap Year.");
                if(month == 2 && year%2 != 0){
                    day = 28;
                } else if (month == 2 && year%2 == 0){
                    day = 29;
                }
            } else {
                System.out.println(year + " is not Leap Year.");
            }

            System.out.println("There are " + day + " days in Month " + month + " in " + year + ".");
        }
    }
}
