package Homework.one;
//Write a program that reverses the elements of an array and prints the reversed array.
public class que_16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int size = arr.length;
        for (int i = 0; i < size/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[size-1-i] ;
            arr[size-1-i] = temp;
        }
        System.out.println("Reversed array:-   ");
        for (int i:arr){
            System.out.println(i);
        }
    }
}
