package arrays;

import java.util.Scanner;

//List of elements of same type
//placed in contiguous memory location
//can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
public class basic {
    public static void main(String[] args) {

        //array Syntax
        //dataType arrayName[] =new dataType[size]

        //int arr[]  = new int[20];     //can't change array size at run time
        //int num[] = {3,2,6};
        //String s[] ={"Apple","orange","mango"}

        //Taking input

        int[] marks = new int[40];              //declaration with initialization
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("JAVA:- "+marks[0]);
        System.out.println("C++:- "+marks[1]);
        System.out.println("Python:- "+marks[2]);

        //Update
        marks[2]=87;
        System.out.println("Python:- "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is:-  " + percentage + "%");

    }
}
