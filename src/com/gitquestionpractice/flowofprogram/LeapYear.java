package com.gitquestionpractice.flowofprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Please enter a year: ");
        Scanner sc =  new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("Leap year.");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year.");
        } else if (year%4 == 0) {
            System.out.println("Leap year.");
        }else{
            System.out.println("Not a leap year.");
        }
    }
}
