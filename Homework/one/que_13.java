package Homework.one;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class que_13 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a number:-  ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <=num ; i++) {
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
