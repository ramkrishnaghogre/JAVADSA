package com.ramkrishna;

import java.util.Scanner;

public class MaxMin {

    static  int max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
    static int min(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Three Numbers: ");
        int a=in.nextInt(),b= in.nextInt(),c=in.nextInt();

        System.out.println("Maximum is "+max(a,b,c)+", Minimum is "+min(a,b,c));
    }
}
