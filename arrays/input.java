package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //*******************Primitive Array*******************
        int[] arrOne = new int[5];
        arrOne[0] = 44;
        arrOne[1] = 4;
        arrOne[2] = 664;
        arrOne[3] = 443;
        arrOne[4] = 2;
        //[44,4,664,443,2]
       //System.out.println(arrOne[4]);

        //input using for loop
        int[] arrTwo = new int[4];
        for (int i  = 0; i <arrTwo.length ; i++) {
         //   arrTwo[i] = sc.nextInt();
        }

        for (int num:arrTwo){ //for every element in array, print the element
         //   System.out.print(num+ " "); //num represents element of array
        }

        //toString method
        //System.out.println(Arrays.toString(arrTwo));

        //*************Array of Object*******************
        String[] str1 = new String[5];
        for (int i = 0; i < str1.length; i++) {
            str1 [i] = sc.next();
        }
        for (String str:str1){
            System.out.print(str);
        }
    }
}
