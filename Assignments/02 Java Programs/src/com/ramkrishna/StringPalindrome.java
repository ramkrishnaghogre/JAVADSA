package com.ramkrishna;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str=in.next();

        int n=str.length(),i=0;
        boolean palindrome=true;

        while(i<(n/2))
        {
            if(str.charAt(i++)!=str.charAt(--n))
            {
                palindrome=false;
                break;
            }
        }
        if(palindrome)
            System.out.println("The given string is palindrome");
        else
            System.out.println("The given string is not a palindrome");
    }
}
