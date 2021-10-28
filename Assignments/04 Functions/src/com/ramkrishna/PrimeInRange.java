package com.ramkrishna;

import java.util.Scanner;

public class PrimeInRange{
    static void primeInRange(int m,int n) {
        boolean isPrime= m != 1;
        for (int i = m; i <= n; i++)
        {
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i+" ");
            else
                isPrime=true;
        }
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter two positive Integer: ");
        primeInRange(in.nextInt(),in.nextInt());
    }

}
