package com.ramkrishna;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str=in.nextLine();
        int n=str.length()-1;

        for (int i = n; i >=0 ; i--)
            System.out.print(str.charAt(i));
    }
}
