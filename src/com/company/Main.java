package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input =1;
        while(input==1)
        {
            System.out.println("Welcome to my calculator :\n");
            System.out.println("Enter your choice from below :\n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. SquareRoot");
            System.out.println("6. Square");
            System.out.println("7. Cube\n");
            int choice=sc.nextInt( );
            double n1,n2;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the first no :");
                    n1 = sc.nextDouble();
                    System.out.println("Enter the second no :");
                    n2 = sc.nextDouble();
                    double add = n1 + n2;
                    System.out.println("Addition of " + n1 + " & " + n2 + " is " + add);
                }
                case 2 -> {
                    System.out.println("Enter the first no :");
                    n1 = sc.nextDouble();
                    System.out.println("Enter the second no :");
                    n2 = sc.nextDouble();
                    double sub = n1 - n2;
                    System.out.println("Subtraction of " + n1 + " & " + n2 + " is " + sub);
                }
                case 3 -> {
                    System.out.println("Enter the first no :");
                    n1 = sc.nextDouble();
                    System.out.println("Enter the second no :");
                    n2 = sc.nextDouble();
                    double mul = n1 * n2;
                    System.out.println("Multiplication of " + n1 + " & " + n2 + " is " + mul);
                }
                case 4 -> {
                    System.out.println("Enter the dividend :");
                    n1 = sc.nextLong();
                    System.out.println("Enter the divisor :");
                    n2 = sc.nextLong();
                    double div = n1 / n2;
                    System.out.println("Division of " + n1 + " & " + n2 + " is " + div);
                }
                case 5 -> {
                    System.out.println("Enter the no :");
                    n1 = sc.nextDouble();
                    double sqrt = Math.pow(n1, 0.5);
                    System.out.println("SquareRoot of " + n1 + " is " + sqrt);
                }
                case 6 -> {
                    System.out.println("Enter the no :");
                    n1 = sc.nextDouble();
                    double sqr = Math.pow(n1, 2);
                    System.out.println("Square of " + n1 + " is " + sqr);
                }
                case 7 -> {
                    System.out.println("Enter the no :");
                    n1 = sc.nextDouble();
                    double cube = Math.pow(n1, 3);
                    System.out.println("Cube of " + n1 + " is " + cube);
                }
                default -> System.out.println("Invalid input");
            }
            System.out.println("Enter 1 to calculate again & Enter 0 to quit :");
            input=sc.nextInt();
            if(input==0)
            {
                System.out.println(" ...!! Thank You !!... ");
                break;
            }
        }
	
    }
}
