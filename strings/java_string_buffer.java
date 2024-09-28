package strings;

//Java StringBuffer class is used to create mutable (modifiable) String objects.
// The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
public class java_string_buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        //------------------append----------------------

        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java

        //---------------------insert-------------------
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints HJavaello

        //---------------------replace-------------------
        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo

        //--------------------delete---------------------
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo

        //--------------------reverse---------------------
        sb.reverse();
        System.out.println(sb);//prints olleH
    }
}
