package com.ramkrishna;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a positive Integer");
        int n=in.nextInt(),sum=0;

        for (int i = 1; (i * i) <= n; i++) {
            if (n%i==0)
            {
                if(i == (n / i))
                    sum += i;
                else
                    sum += i + (n / i);
            }
        }
        sum=sum-n;

        if (sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
