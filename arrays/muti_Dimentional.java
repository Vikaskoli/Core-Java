package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class muti_Dimentional {
    public static void main(String[] args) {
        
        //Arrays of array
        Scanner sc = new Scanner(System.in);

        int[][] arrOne= new int[3][];//must have to specify number of rows columns are optional
//        int[][] arrOne2D = {
//                {1,2,3,4},
//                {5,6},
//                {7,8,9}
//        };
        
        int[][] arrTwo=new int[3][3];
        for (int row = 0; row < arrTwo.length; row++) { //iterating row

            for (int col = 0; col < arrTwo[row].length; col++) {//iterating individual column

                arrTwo[row][col] = sc.nextInt();
                
            }
        }

        //output
        for (int[] ints : arrTwo) { //iterating row

            for (int anInt : ints) {//iterating individual column

                System.out.print(anInt + " ");

            }
            System.out.println();
        }
  }
}
