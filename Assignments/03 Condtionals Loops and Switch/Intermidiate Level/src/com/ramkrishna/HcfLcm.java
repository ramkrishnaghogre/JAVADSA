package com.ramkrishna;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter two Integers: ");
         int num1=Math.abs(in.nextInt()), num2= Math.abs(in.nextInt());

        int a=num1,b=num2,HCF;
        while(true)
        {
            if(a==0)
            {
                HCF=b;
                break;
            }
            else if (b==0 || a==b)
            {
                HCF=a;
                break;
            }
            else if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        if(num1==0 || num2==0)
        {
            if(num1==0 && num2==0)
                System.out.println("LCM and HCF not defined");
            else
                System.out.println("HCF is "+HCF+" and LCM is not defined");
        }
        else
            System.out.println("HCF is "+HCF+" and LCM is "+((num1*num2)/HCF));
    }
}
