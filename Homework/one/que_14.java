package Homework.one;

import java.util.Scanner;

//14.Write a program that asks the user for a number and prints its multiplication table up to 10.
public class que_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:-  ");
        int num = sc.nextInt();
        int mul = 0;

        for (int i = 0; i <=10 ; i++) {
            mul= num * i;
        }
        System.out.println(mul);
    }

}
