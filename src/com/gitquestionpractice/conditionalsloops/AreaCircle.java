package com.gitquestionpractice.conditionalsloops;

import java.util.Scanner;

import static java.lang.Math.pow;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        float radius  = sc.nextFloat();
        float area = 3.14f * (float)pow(radius,2);
        System.out.println("Area of the circle is "+area);
    }
}
