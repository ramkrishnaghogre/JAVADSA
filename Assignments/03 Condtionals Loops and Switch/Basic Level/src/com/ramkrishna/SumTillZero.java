package com.ramkrishna;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long sum=0;
        int n;
        do{
            System.out.print("Enter an Integer: ");
            n=in.nextInt();
            sum=sum+n;
        }
        while (n!=0);
        System.out.println("Sum is "+sum);
    }
}
