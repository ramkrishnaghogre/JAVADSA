package com.ramkrishna;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        long n=in.nextLong(),first=0,second=1;

        for (long i = 0; i < n; i++) {
            System.out.print(second+" ");
            second=second+first;
            first=second-first;
        }
    }
}
