package com.gitquestionpractice.firstjava;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int i,flag =0;
        for(i=0;i<=(len/2-1);i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("The string is Palindrome.");
        }else{
            System.out.println("The string is not Palindrome.");
        }
    }
}
