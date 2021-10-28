package com.ramkrishna;

import java.util.Scanner;

public class DifferentSum {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int n;
        long negativeSum=0,positiveEvenSum=0,positiveOddSum=0;

        do{
            System.out.print("Enter an Integer:");
            n=in.nextInt();
            if(n<0)
                negativeSum+=n;
            else if (n%2==0)
                positiveEvenSum+=n;
            else
                positiveOddSum+=n;
        }while (n!=0);

        System.out.println("Negative Sum: "+negativeSum+", Positive Even Sum: "+positiveEvenSum+", Positive Odd Sum: "+positiveOddSum);

    }
}
