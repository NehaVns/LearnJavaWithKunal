package com.gitquestionpractice.firstjava;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Choose an operator (+,-,*,/) : ");
        char operator = sc.next().charAt(0);
        while(true){
            if(operator=='+'){
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            }else if(operator=='-'){
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            }else if(operator=='*'){
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            }else if(operator=='/'){
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            }else{
                System.out.print("Invalid Input. Choose an operator (+,-,*,/) : ");
                operator = sc.next().charAt(0);
            }

        }
    }
}
