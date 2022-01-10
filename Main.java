package com.javavarshitha;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        final byte monthsInYear =12;
        final byte percent = 100;

        int principal = 0;
        float monthlyInterest =0;
        int numberOfPayments =0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Principal: ");
             principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter the value between 1000 and 1000000");
        }
        while(true){
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest>= 1 && annualInterest<=30){
                 monthlyInterest=annualInterest/percent/monthsInYear;
                 break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while(true){
            System.out.println("Period(years): " );
            byte years = scanner.nextByte();
            if(years>=1 && years <= 30){
                numberOfPayments = years * monthsInYear;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }
        double mortgage = principal*
                (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments)/(Math.pow(1+monthlyInterest,numberOfPayments)-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


        }

    }
