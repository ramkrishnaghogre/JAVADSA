package com.ramkrishna;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        long first=1,second=1;

        System.out.println("Enter an positive integer: ");
        int n=in.nextInt(),i=0;


            while(i!=n)
            {
                i++;

                if(i<=2)
                {
                    System.out.print("1 ");
                }
                else
                {
                    second=second+first;
                    first=second-first;

                    System.out.print(second+" ");
                }
            }

    }
}
