package Homework.one;

import java.util.Scanner;

//17.Write a program that asks the user to enter a number and checks if that number is present in an array.
public class que_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = {33,543,22,3,768};
        System.out.print("Enter a number to check:-  ");
        int num = sc.nextInt();

        //boolean found = false;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == num){
                System.out.println("Present.......");
                return;

            }
        }
        System.out.println("Not Present........");
    }
}
