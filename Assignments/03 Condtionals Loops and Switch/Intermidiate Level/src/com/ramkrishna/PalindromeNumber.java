package com.ramkrishna;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter an Integer");
        long num=in.nextLong(),
             rev=0,temp;

        temp=num;
        while (temp!=0){
            rev=rev*10;
            rev=rev+temp%10;
            temp=temp/10;
        }
        if (rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
