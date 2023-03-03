package com.gitquestionpractice.conditionalsloops;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the base : ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.print("Enter the height : ");
        int height = sc.nextInt();
        float area = base*height/2.0f;
        System.out.println("Area of the triangle is "+area);
    }
}
