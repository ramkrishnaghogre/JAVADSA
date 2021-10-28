package com.ramkrishna;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int i,j,armstrong=0,temp,digit;

        System.out.print("Enter two positive integers: ");
        i=in.nextInt()+1;
        j=in.nextInt();

        while (i<j)
        {
            temp=i;
            while (temp!=0)
            {
                digit=temp%10;
                temp=temp/10;
                armstrong=armstrong+(digit*digit*digit);
            }
            if(i==armstrong)
                break;

            armstrong=0;
            i++;
        }
        if (armstrong==0)
            System.out.println("No Armstrong between the given range.");
        else
            System.out.println("Armstrong number found: "+armstrong);
    }
}
