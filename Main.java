package com.javavarshitha;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte monthsInYear =12;
        final byte  percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/percent/monthsInYear;
        System.out.print("period(Years): ");

        byte years = scanner.nextByte();//mortgage formula
        int numberOfPayments = years * monthsInYear;// mf = P(1+r)^n/(1+r)^n-1
        double mortgage = principal*(monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments))-1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
