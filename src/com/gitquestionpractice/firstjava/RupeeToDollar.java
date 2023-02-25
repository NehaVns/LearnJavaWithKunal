package com.gitquestionpractice.firstjava;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees : ");
        float rupee = sc.nextFloat();
        float dollar = rupee * 0.012f;
        System.out.println(dollar+" $");


    }
}
