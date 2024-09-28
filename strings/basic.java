package strings;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class basic {
    public static void letters (String str){
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
        
    }

    public static boolean isPalindrome (String str){
        for (int i = 0; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "Greatest of all time:- ";
        String str2 = new String("Virat");
        System.out.println(str2);


        //Strings are immutable (Not changeable)

        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
//if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object
//        s=s.concat(" Tendulkar");
//        System.out.println(s);


        //----------------Taking Input && Output-------------------

        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();  //only takes single word
       // name = sc.nextLine();  //takes full line
       // System.out.println(name);

        //------------------Length function------------------------
        System.out.println(str1.length());

        //--------------------Concatenation-------------------------
        String concatenate = str1 + str2;
        System.out.println(concatenate);

        //-----------------------charAt-----------------------------
        System.out.println("Letter at index o:- "+str1.charAt(0));
        letters(str2);


        //----------------------isPalindrome----------------------
        String str = "MADAM";
        System.out.println(isPalindrome(str));

    }
}
