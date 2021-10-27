package com.ramkrishna;

import java.util.Scanner;

public class IfCalculator {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Two Integers: ");

        int num1=in.nextInt(),num2=in.nextInt();

        System.out.println("Enter Operator: ");
        char operator=in.next().trim().charAt(0);

        if(operator=='+')
            System.out.println("Output is "+(num1+num2));
        else if (operator=='-')
            System.out.println("Output is "+(num1-num2));
        else if (operator=='*')
            System.out.println("Output is "+(num1*num2));
        else if(operator=='/')
            System.out.println("Output is "+(num1/num2));
        else
            System.out.println("Invalid Operator");

    }
}
