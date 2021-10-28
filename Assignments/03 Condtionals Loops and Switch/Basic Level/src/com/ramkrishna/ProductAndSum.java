package com.ramkrishna;

import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        long n=in.nextLong(),sum=0,product=1;

        while(n!=0)
        {
            sum=sum+(n%10);
            product=product*(n%10);
            n=n/10;
        }
        System.out.println("Result is "+(product-sum));

    }
}
