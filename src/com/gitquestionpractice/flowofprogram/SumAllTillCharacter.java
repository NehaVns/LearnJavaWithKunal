package com.gitquestionpractice.flowofprogram;

import java.util.Scanner;

public class SumAllTillCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number (or 'x' to exit) : ");
            String value = input.nextLine();
            if(value.equals("x")){
                break;
            }
            try {
                int num = Integer.parseInt(value);
                sum+=num;
            }catch (NumberFormatException e){
                System.out.print("Invalid input. ");
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
