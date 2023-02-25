package com.gitquestionpractice.firstjava;

import java.util.Scanner;

public class LargestNumberBetweenTwo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is largest.");
        } else if (b > a) {
            System.out.println(b+" is largest.");
        }else{
            System.out.println("Both are same.");
        }
    }
}
