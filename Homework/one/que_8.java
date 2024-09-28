package Homework.one;
//Write a program that calculates and prints the average of elements in an array.
public class que_8 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int sum = 0;
        for (int i = 0;i< arr.length;i++) {             //enhanced for loop

            sum = sum + arr[i];
        }
        double average = (double)sum/ arr.length;
        System.out.println(average);
    }
}
