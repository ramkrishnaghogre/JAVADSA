package com.ramkrishna;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        System.out.println("Hello "+in.nextLine()+".");
    }
}
