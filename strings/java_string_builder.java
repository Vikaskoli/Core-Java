package strings;

public class java_string_builder {
    public static void main(String[] args) {

        //String: immutable 
        //StringBuilder: mutable + without thread safety
        //StringBuffer: mutable + with thread safety

        //--------------------append----------------
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java

        //-----------------insert-------------------
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints HJavaello

        //--------------------replace--------------
        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo

        //-------------------delete--------------
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo

        //---------------------reverse--------------

        sb.reverse();
        System.out.println(sb);//prints olleH
    }
}
