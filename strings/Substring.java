package strings;

import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        //Substring:- A part of String is called substring.
//    startIndex: inclusive
        //Inclusive means that the character at the startIndex position is included in the resulting substring.
//    endIndex: exclusive
        //Exclusive means that the character at the endIndex position is not included in the resulting substring.

        String s="SachinTendulkar";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar
        System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin

//--------------split()--------------------
        String text= new String("Hello, My name is Sachin. Greatest of all time player");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }
}
