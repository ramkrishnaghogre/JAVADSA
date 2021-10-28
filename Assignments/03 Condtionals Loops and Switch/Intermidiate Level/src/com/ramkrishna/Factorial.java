package com.ramkrishna;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a positive Integer");
        int n=in.nextInt(),factorial=1;

        if(n==1 || n==0) {
            System.out.println("Factorial is 1");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial=factorial*i;
            }
            System.out.println("Factorial is "+factorial);
        }
    }
}
