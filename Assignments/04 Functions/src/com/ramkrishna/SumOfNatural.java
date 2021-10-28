package com.ramkrishna;

import java.util.Scanner;

public class SumOfNatural {
    static long sumOfNatural(int n)
    {
        return (long) n *(n+1) /2;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a Natural Number: ");
        System.out.println("Sum of First n Natural Number is "+sumOfNatural(in.nextInt()));
    }
}
