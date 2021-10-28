package com.ramkrishna;

import java.util.Scanner;

public class LargerOfTwo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1=in.nextInt(), num2=in.nextInt();

        System.out.println("Maximum of the two is "+Math.max(num1,num2));
    }
}
