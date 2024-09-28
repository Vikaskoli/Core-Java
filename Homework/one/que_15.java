package Homework.one;

import java.util.Scanner;

//Write a program that asks the user to enter a string and counts the number
// of vowels (a, e, i, o, u) in the string.
public class que_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:-  ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //check each character in string
            if (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                        vowelCount++;
            }
        }

        System.out.println("Number of Vowels present:-  "+vowelCount);

    }
}
