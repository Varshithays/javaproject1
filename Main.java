package com.javavarshitha;

import java.util.Random;

public class Main{

    public static void main(String[] args) {
	// write your code here
        int length = 10;
        System.out.println(generate_password(length));
    }
    static char[] generate_password(int len)
    {
        System.out.println("Generating password using random(): ");
        System.out.println("Your new password is : ");


        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capital_chars + Small_chars +
                numbers + symbols;

        // Using random method
        Random rndm_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
                    values.charAt(rndm_method.nextInt(values.length()));

        }
        return password;
    }
    }

