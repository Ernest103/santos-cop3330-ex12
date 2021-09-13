package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double initAmount, finalAmount, rate;
        int years;

        System.out.print("What is the principal amount? ");
        initAmount = sc.nextDouble();
        System.out.print("What is the interest rate ");
        rate = sc.nextDouble();
        System.out.print("Enter the number of years ");
        years = sc.nextInt();

        finalAmount = interestGain(initAmount, rate, years);

        System.out.printf("After %d years at %.1f%%, the investment will " +
                "be worth $%.2f.", years, rate, finalAmount);

    }

     private static double interestGain(double amount, double rate, int years){
        rate = rate/100;

        return amount * (1 + (rate * years));
    }
}
