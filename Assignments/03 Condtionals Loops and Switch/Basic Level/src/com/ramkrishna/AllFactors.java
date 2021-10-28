package com.ramkrishna;

import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int n=in.nextInt();

        for (int i = 1; (i*i) <=n ; i++) {
            if(n%i==0)
            {
                if(i!=n/i)
                    System.out.print(i+" "+n/i+" ");
                else
                    System.out.print(i+" ");
            }
        }
    }
}
