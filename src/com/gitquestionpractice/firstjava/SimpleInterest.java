package com.gitquestionpractice.firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount : ");
        float principle = input.nextFloat();
        System.out.print("Enter rate of interest (between 0 and 1) : ");
        float rate = input.nextFloat();
        System.out.print("Enter time period in years : ");
        float time = input.nextFloat();
        float si = (principle*rate*time);
        System.out.println("Simple Interest = "+si);

    }
}
