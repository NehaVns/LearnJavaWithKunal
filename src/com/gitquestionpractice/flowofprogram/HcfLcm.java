package com.gitquestionpractice.flowofprogram;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        System.out.print("Enter a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int hcf = h_c_f(a,b);
        int lcm = (a*b)/hcf;
        System.out.println("HCF = "+hcf+" LCM = "+lcm);
    }

    private static int h_c_f(int a, int b) {
        if(b==0){
            return a;
        }
        return h_c_f(b,a%b);
    }
}
