package com.ramkrishna;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double P,R,T;
        System.out.println("Enter Principle Amount: ");
        P=in.nextDouble();

        System.out.println("Enter Time in years: ");
        T=in.nextDouble();

        System.out.println("Enter Rate:");
        R=in.nextDouble();

        System.out.println("Simple Intres is "+(P*R*T/100));
    }
}
