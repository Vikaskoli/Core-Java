package Homework.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program that asks the user for
// 10 numbers and stores them in an array. Then, print the even and odd numbers separately.
public class que_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0;i<arr.length;i++){
            System.out.println("Enter Number" + (i+1) + ":" );
            arr[i] = sc.nextInt();
        }

        for (int element:arr){
            if(element % 2 == 0){
                evenNumbers.add(element);
            }else {
                oddNumbers.add(element);
            }
        }

        System.out.println("Even numbers are: "+evenNumbers);
        System.out.println("Odd numbers are: "+oddNumbers);
    }
}
