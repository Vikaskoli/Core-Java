package Homework.one;

import java.util.Scanner;

//Write a program that asks the user to enter 5 integers, stores them in an array, and prints the array.
public class que_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter 5 integers:- ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        for (int j : arr) {                 //enhanced for loop
            System.out.println(j);
        }
    }
}
