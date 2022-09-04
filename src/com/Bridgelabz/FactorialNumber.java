package com.Bridgelabz;

import java.util.Scanner;

public class FactorialNumber {
    public static void main (String[] args){


        System.out.println("********************************************");
        System.out.println(" Welcome to Factorial of a Number...");
        System.out.println("********************************************");

        System.out.println("Enter A Number = ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int fac = 1;
        for (int i=1 ; i <= a ; i++)
        {
            fac = fac*i;
        }
        System.out.println("Factorial Of No. "+a+" is = "+fac);
    }
}
