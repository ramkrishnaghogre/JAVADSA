package com.ramkrishna;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int max=Integer.MIN_VALUE,n;
        do {
            System.out.print("Enter an Integer: ");
            n=in.nextInt();
            if(n>max)
                max=n;
        }while(n!=0);
        System.out.println("Larges of the numbers is "+max);
    }
}
