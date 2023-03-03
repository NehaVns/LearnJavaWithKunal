package com.gitquestionpractice.firstjava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms in th series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci : ");
        int t1 = 0, t2= 1,sum=0,i;
        for(i=1;i<=n;i++){
            System.out.print(t1+", ");
            sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();

    }

}
