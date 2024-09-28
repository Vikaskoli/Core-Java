package strings;

public class string_compare {
    public static void main(String[] args) {

//    ------------------By Using equals() Method----------------------
        // String class equals() method compares the original content of the string
        //It compares values of string for equality

//        String s1="Sachin";
//        String s2="Sachin";
//        String s3=new String("Sachin");
//        String s4="Saurav";
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.equals(s3));//true
//        System.out.println(s1.equals(s4));//false

        String s1="Sachin";
        String s2="SACHIN";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

//    ------------------------By Using == Operator---------------------------
    //The == operator compares references not values.

//        String s1="Sachin";
//        String s2="Sachin";
//        String s3=new String("Sachin");
//        System.out.println(s1==s2);//true (because both refer to same instance)
//        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)

//    ------------------------By compareTo() Method----------------------------
    //compareTo() method is a part of the Comparable interface in Java, used to compare two objects.
    // For String objects, it compares them lexicographically (dictionary order).
//        String s1="Sachin";
//        String s2="Sachin";
//        String s3="Ratan";
//        System.out.println(s1.compareTo(s2));//0
//        System.out.println(s1.compareTo(s3));//1(because s1>s3)
//        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )


    }
}
