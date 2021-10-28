package com.ramkrishna;

import java.util.Scanner;

public class IsPrime {
    static boolean isPrime(int num){
        for (int i = 2; i*i <=num ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=in.nextInt();

            System.out.println("It is "+isPrime(n)+" that the number is prime.");
    }
}
