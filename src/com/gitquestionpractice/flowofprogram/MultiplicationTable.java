package com.gitquestionpractice.flowofprogram;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        System.out.println("Multiplication Table of "+a+" is given by:-");
        for(i=1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }
}
