package com.ramkrishna;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Amount in Rupees: ");
        double amount=in.nextDouble();

        System.out.println("Equivalent Amount in USD is "+amount/75);
    }
}
