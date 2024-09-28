package Homework.one;

import java.util.Scanner;

//Write a program that prompts the user to enter two numbers and prints their sum.
public class que_4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("first number:- ");
       int num1 = sc.nextInt();
       System.out.print("second number:- ");
       int num2 = sc.nextInt();
       System.out.println("Addition:- "+(num1+num2));
    }
}
